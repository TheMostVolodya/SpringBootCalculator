package com.calculator.spring.service;

import com.calculator.spring.model.MathMarker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculateService {

    public static final String ERROR_MASSAGE = "Ошибка при выполнении";

    public String calculate(String valueOne, String valueTwo, MathMarker marker) {
        long result;
        try {
            Long value1 = Long.valueOf(valueOne);
            Long value2 = Long.valueOf(valueTwo);

            switch (marker) {
                case PLUS -> result = value1 + value2;
                case MINUS -> result = value1 - value2;
                case DIVIDE -> result = value1 / value2;
                case MULTIPLY -> result = value1 * value2;
                default -> result = 0L;

            }
        } catch (Exception e) {
            log.error(ERROR_MASSAGE, e);
            return ERROR_MASSAGE + String.format(", первое %s, второе %s", valueOne, valueTwo);
        }
        return Long.toString(result);
    }


}
