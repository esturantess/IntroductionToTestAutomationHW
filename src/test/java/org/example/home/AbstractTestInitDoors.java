package org.example.home;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class AbstractTestInitDoors {

    static List<Door> doors;

    @BeforeAll
    static void initTest() {
        System.out.println("Test init");
    }
    @BeforeEach
    void initDoors () {
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }
}
