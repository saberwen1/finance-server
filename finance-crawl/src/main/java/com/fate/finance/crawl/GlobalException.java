package com.fate.finance.crawl;

import com.fate.finance.api.ResponseBean;
import javax.validation.UnexpectedTypeException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Fate
 * @date : 2020/5/6
 */
@RestControllerAdvice
public class GlobalException {

  @InitBinder
  public void initBinder(WebDataBinder binder) {
  }

  /**
   * request param Exception Handler
   */
  @ExceptionHandler(Exception.class)
  public ResponseBean<Void> handleException(UnexpectedTypeException e) {

    return new ResponseBean<>(500, e.getMessage());
  }

}
