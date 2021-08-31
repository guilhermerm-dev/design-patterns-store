package br.com.store.taxes;

import java.math.BigDecimal;
import br.com.store.budgets.Budget;

public class ICMS extends Tax {

    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
