package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
@ApiModel(description = "Simple pojo to check swagger api")
public class ExchangeInfo {

	private String currency;

}
