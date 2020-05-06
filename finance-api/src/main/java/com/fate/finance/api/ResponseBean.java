package com.fate.finance.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Fate
 * @date : 2020/5/6
 */

@Data
@NoArgsConstructor
public class ResponseBean<T> {

  private Integer code = 200;
  private String message = "OK";

  private T data;

  public ResponseBean(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public ResponseBean(T data) {
    this.data = data;
  }
}
