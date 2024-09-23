package com.spe_project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    private App calculator;
    
    @Before
    public void init() {
        calculator = new App();
    }

    @SuppressWarnings("deprecation")
    @Test
    public void test_sqrt() {
        double num = 25;
        double expected = 5;
        double result = calculator.sqrt(num);
        Assert.assertEquals(expected, result,0.001);
    }

    @Test
    public void test_factorial() {
        int num = 5;
        int expected = 120;
        int result = calculator.factorial(num);
        Assert.assertEquals(expected, result);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void test_power() {
        double num = 25;
        double exp = 2;
        double expected = 625;
        double result = calculator.power(num,exp);
        Assert.assertEquals(expected, result,0.001);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void test_loge() {
        double num = 2.718281828;
        double expected = 1;
        double result = calculator.loge(num);
        Assert.assertEquals(expected, result,0.001);
    }
}
