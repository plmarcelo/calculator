package com.privalia.main;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

public class Main {
    public static void main(String[] args) {
        ICalculator calculator = new Calculator();
        StringBuilder stringBuilder = new StringBuilder("El resultado de la suma es ");
        System.out.println(stringBuilder.append(calculator.sum(2, 2)));
    }
}
