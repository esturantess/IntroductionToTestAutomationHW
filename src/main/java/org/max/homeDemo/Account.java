package org.max.homeDemo;

/**
 * Счет, входит в портфолио имеет стоимость
 */
public class Account implements IElement{

    private Long sum;

    public Account(Long sum) {
        this.sum = sum;
    }

    @Override
    public Long getSum() {
        return sum;
    }
}
