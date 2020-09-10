package com.fate.finance.crawl.controller;

import com.fate.finance.api.AspectCrawlController;
import com.fate.finance.api.ResponseBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Fate
 * @date : 2020/5/6
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Api
public class TestController implements AspectCrawlController {

  @Value("${server.port}")
  String serverPort;

  @GetMapping(API_V1 + "test")
  public ResponseBean test() {
//1
    return new ResponseBean("hello" + serverPort);
  }


}
