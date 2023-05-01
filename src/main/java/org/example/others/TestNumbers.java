package org.example.others;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.text.NumberFormat;

// also there is a class called joda money, check check!
@Slf4j
public class TestNumbers {
    public static void main(String[] args) {
        Float f = new Float(1-0.1);
        Double d = Double.valueOf(1-0.1);
        BigDecimal bd = new BigDecimal(String.valueOf(1-0.1));

        log.info("F is" + f + " D is " + d + " BD is " + bd);
        log.info("hi:" +2.3*1.9/3.0);

        BigDecimal amount= new BigDecimal("10000.5445");
        BigDecimal rate= new BigDecimal("0.0008");
        BigDecimal interest = amount.multiply(rate);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat ir = NumberFormat.getPercentInstance();
        log.info(currency.format(amount));
        log.info(ir.format(rate));
        log.info(currency.format(interest));

    }
}
