package com.fate.finance.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : Fate
 * @date : 2020/5/6
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicaiton {

  public static void main(String[] args) {
    SpringApplication.run(EurekaApplicaiton.class, args);
  }

}
