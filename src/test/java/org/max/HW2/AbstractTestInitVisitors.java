package org.max.HW2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTestInitVisitors {

    static List<ITableCount> visitorsGroup1 = new ArrayList<>();
    static List<ITableCount> visitorsGroup2 = new ArrayList<>();

    @BeforeAll
    static void initTest() {
        System.out.println("Запуск тестов...");
    }

    @BeforeEach
    void initVisitors () throws Exception {
        visitorsGroup1.add(new SingleVisitor(200.00));
        visitorsGroup1.add(new SingleVisitor(334.37));

        visitorsGroup2.addAll(visitorsGroup1);
        visitorsGroup2.add(new SingleVisitor(564.13));
    }
}
