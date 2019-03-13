package com.example.contractdemo.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyControllerTest {


    @Test
    public void cheeky_test(){
        var cc = new CurrencyController();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("abcdefg");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        assertEquals(3,cc.getSupportedCurrencyValues().size());
    }
}