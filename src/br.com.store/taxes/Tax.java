package br.com.store.taxes;

import br.com.store.budgets.Budget;
import java.math.BigDecimal;

public abstract class Tax {

    public abstract BigDecimal calculate(Budget budget);
}
