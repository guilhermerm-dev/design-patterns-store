package br.com.store.discounts;

import br.com.store.budgets.Budget;
import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount(){
        super(null);
    }

    @Override
    public BigDecimal applyCalculus(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApplyDiscount(Budget budget) {
        return true;
    }
}
