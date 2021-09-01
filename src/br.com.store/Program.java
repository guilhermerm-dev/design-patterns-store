package br.com.store;

import br.com.store.budgets.*;
import br.com.store.discounts.DiscountCalculator;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
//        Strategy
//        ICMS tax = new ICMS();
//        ISS tax = new ISS();
//        TaxCalculator taxCalculator = new TaxCalculator();
//        Budget budget = new Budget(new BigDecimal("1000"));
//        System.out.println(taxCalculator.calculate(budget, tax));


        // Chain of Responsibility
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Budget budget1 = new Budget(new BigDecimal("200"), 6);
        Budget budget2 = new Budget(new BigDecimal("1000"), 1);
        System.out.println(discountCalculator.calculate(budget1));
        System.out.println(discountCalculator.calculate(budget2));
    }
}
