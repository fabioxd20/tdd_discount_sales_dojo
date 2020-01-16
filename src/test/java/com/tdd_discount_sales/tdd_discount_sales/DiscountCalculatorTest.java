package com.tdd_discount_sales.tdd_discount_sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void calculateDiscountWhenBiggerThanOrEquals500(){
        double salesValue = 500.00;
        double finalValue = 450.00;

        assertEquals(finalValue, discountCalculator.calculateFinalValue(salesValue));
    }

    @Test
    public void calculateDiscountWhenBiggerThanOrEquals1000(){
        double salesValue = 1000.00;
        double finalValue = 800.00;

        assertEquals(finalValue, discountCalculator.calculateFinalValue(salesValue));
    }

    @Test
    public void calculateDiscountWhenValueIsOverOrEquals1000(){
        double salesValue = 1000.00;
        double discountValue = 200.00;

        assertEquals(discountValue, discountCalculator.calculateDiscountValue(salesValue));
    }

    @Test
    public void calculateFinalValueWhenValueIsUnder500(){
        double salesValue = 400.00;
        double finalValue = 380.00;

        assertEquals(finalValue, discountCalculator.calculateFinalValue(salesValue));
    }
}