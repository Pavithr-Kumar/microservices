package com.zettamine.accounts;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zettamine.accounts.dto.CardsDto;

import io.github.resilience4j.retry.annotation.Retry;

@FeignClient("cards")

public interface CardsFeignClient {

 
  @GetMapping(path = "/api/fetch", consumes = "application/json")
  ResponseEntity<CardsDto> fetchCardDetails(@RequestParam String mobileNumber);
}
