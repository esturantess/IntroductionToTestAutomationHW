package org.max.HW2;

public class SingleVisitor implements ITableCount {

    public Double visitorBill;

    public SingleVisitor(Double visitorBill) throws Exception {
        if (visitorBill < 0) {
            throw new Exception("Сумма счета не может быть отрицательной.");
        }
        else if (visitorBill > 50000) {
            throw new Exception("Сумма счета не может быть больше 50 000.");
        }
        else {
            this.visitorBill = visitorBill;
        }
    }

    @Override
    public Double getTableBill() {
        return visitorBill;
    }
}
