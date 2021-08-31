package br.com.store.taxes;

import br.com.store.budgets.Budget;
import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
