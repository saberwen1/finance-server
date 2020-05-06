package com.fate.finance.crawl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : Fate
 * @date : 2020/5/6
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CrawlApplication {

  public static void main(String[] args) {
    SpringApplication.run(CrawlApplication.class, args);
  }

}
