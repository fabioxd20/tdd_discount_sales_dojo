package com.tdd_discount_sales.tdd_discount_sales;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    public double calculateFinalValue(double salesValue) {
        return salesValue - this.calculateDiscountValue(salesValue);
    }

    public double calculateDiscountValue(double salesValue) {

        if(salesValue >= 1000) {
            return salesValue * .2;
        }
        else if (salesValue >= 500) {
            return salesValue * .1;
        }
        else {
            return salesValue * .05;
        }
    }
}

