package com.example.contractdemo.service;

import com.example.contractdemo.model.CurrencyValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class CurrencyController {

    @GetMapping("currencies")
    public List<CurrencyValue> getSupportedCurrencyValues(){
        return List.of(
                new CurrencyValue("GBP"),
                new CurrencyValue("USD"),
                new CurrencyValue("CAD")
        );
    }

}
