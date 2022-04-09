package com.calculator.spring.controller;

import com.calculator.spring.model.MathMarker;
import com.calculator.spring.service.CalculateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("calculate/")
@RequiredArgsConstructor
public class CalculateController {
    private final CalculateService calculateService;

    @GetMapping("plus/{firstValue}/{secondValue}")
    public ResponseEntity<String> plus(@PathVariable("firstValue") String firstValue,
                                       @PathVariable("secondValue") String secondValue) {
        String result = calculateService.calculate(firstValue, secondValue, MathMarker.PLUS);
        return ResponseEntity.ok(result);
    }

    @GetMapping("minus/{firstValue}/{secondValue}")
    public ResponseEntity<String> minus(@PathVariable("firstValue") String firstValue,
                                        @PathVariable("secondValue") String secondValue) {
        String result = calculateService.calculate(firstValue, secondValue, MathMarker.MINUS);
        return ResponseEntity.ok(result);
    }

    @GetMapping("multiply/{firstValue}/{secondValue}")
    public ResponseEntity<String> multiply(@PathVariable("firstValue") String firstValue,
                                           @PathVariable("secondValue") String secondValue) {
        String result = calculateService.calculate(firstValue, secondValue, MathMarker.MULTIPLY);
        return ResponseEntity.ok(result);
    }

    @GetMapping("divide/{firstValue}/{secondValue}")
    public ResponseEntity<String> divide(@PathVariable("firstValue") String firstValue,
                                         @PathVariable("secondValue") String secondValue) {
        String result = calculateService.calculate(firstValue, secondValue, MathMarker.DIVIDE);
        return ResponseEntity.ok(result);
    }

}
