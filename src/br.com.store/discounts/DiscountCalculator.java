package br.com.store.discounts;

import java.math.BigDecimal;
import br.com.store.budgets.Budget;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget) {
        NoDiscount noDiscount = new NoDiscount();
        DiscountForBudgetGreaterThanFiveHundred discountForBudgetGreaterThanFiveHundred = new DiscountForBudgetGreaterThanFiveHundred(noDiscount);
        Discount discount = new DiscountForBudgetWithMoreThanFiveItems(discountForBudgetGreaterThanFiveHundred);
        return discount.calculate(budget);
    }
}
