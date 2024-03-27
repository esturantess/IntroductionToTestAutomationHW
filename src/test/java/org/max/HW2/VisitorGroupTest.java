package org.max.HW2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisitorGroupTest extends AbstractTestInitVisitors{

    @Test
    void getGroupTableSumTest() {
        double sum = 0;

        for (ITableCount visitor: visitorsGroup2) {
            sum += visitor.getTableBill();
        }

        Assertions.assertEquals(sum, 1098.5);
    }


    @Test
    void addVisitorsTest() throws Exception{
        SingleVisitor Arny = new SingleVisitor(50.0);
        visitorsGroup1.add(Arny);

        Assertions.assertEquals(visitorsGroup1.get(visitorsGroup1.size() - 1), Arny);
    }
}
