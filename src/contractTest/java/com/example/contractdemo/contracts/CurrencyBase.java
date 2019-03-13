package com.example.contractdemo.contracts;

import com.example.contractdemo.service.CurrencyController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CurrencyController.class)
public abstract class CurrencyBase {

    @Autowired
    CurrencyController currencyController;

    @Before
    public void setup() {
        StandaloneMockMvcBuilder standaloneMockMvcBuilder = MockMvcBuilders.standaloneSetup(currencyController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }


}
