package org.max.HW2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SingleVisitorTest{

    @ParameterizedTest
    @ValueSource(doubles = {0.00, 49999.99})
    void singleVisitorSumTest(double bill) throws Exception{

        Assertions.assertEquals(bill, new SingleVisitor(bill).getTableBill());
    }


    @ParameterizedTest
    @ValueSource(doubles = {-1.00, -100})
    void singleVisitorSumNegativeTest(double bill) throws Exception{

        Assertions.assertThrows(Exception.class, () -> new SingleVisitor(bill));
    }

    @Test
    void singleVisitorOverSumTest() throws Exception{

        Assertions.assertThrows(Exception.class, () -> new SingleVisitor(50000.01));
    }
}
