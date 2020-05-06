package com.fate.finance.analysis.controller;
import com.fate.finance.api.AspectCrawlController;
import com.fate.finance.api.ResponseBean;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Fate
 * @date : 2020/5/6
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class TestController implements AspectCrawlController {

  private static String CRAWL_HOST = "http://CRAWL/";
  @Value("${server.port}")
  String serverPort;

  @Resource
  DiscoveryClient discoveryClient;

  @Autowired
  RestTemplate restTemplate;

  @GetMapping(API_V1 + "test")
  public ResponseBean test() {
    ResponseEntity<ResponseBean> exchange = restTemplate
        .exchange(CRAWL_HOST + "v1/test", HttpMethod.GET, null, ResponseBean.class);
    log.info("------"+serverPort);
    return exchange.getBody();
  }

  @GetMapping(API_V1 + "info")
  public ResponseBean info() {
    List<ServiceInstance> crawl = discoveryClient.getInstances("CRAWL");
    for (ServiceInstance serviceInstance : crawl) {
      log.info("--->"+serviceInstance.getUri());
    }
    List<String> services = discoveryClient.getServices();
    for (String service : services) {
      log.info("--->"+service);
    }
    return new ResponseBean();
  }

}
