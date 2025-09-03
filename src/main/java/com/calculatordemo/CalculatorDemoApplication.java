package com.calculatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorDemoApplication {
    public static void main(String[] args) {
        int x = Calculator.add(2,3);

        int y = Calculator.subtract(2,3);

        System.out.println(x + ", " + y);
    }

}
