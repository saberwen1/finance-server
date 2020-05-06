package com.fate.finance.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Fate
 * @date : 2020/5/6
 */
@EnableEurekaClient
@SpringBootApplication
//todo 理解
@EnableDiscoveryClient
public class AnalysisApplication {

  public static void main(String[] args) {
    SpringApplication.run(AnalysisApplication.class, args);
  }

  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
