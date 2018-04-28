package com.company;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void isUnique1() {

        Main test = new Main();

        Map<String, String> firstLastName1 = new HashMap<>();
        firstLastName1.put("Marty", "Stepp");
        firstLastName1.put("Stuart", "Reges");
        firstLastName1.put("Jessica", "Miller");
        firstLastName1.put("Amanda", "Camp");
        firstLastName1.put("Hal", "Perkins");

        boolean ut = test.isUnique(firstLastName1);
        assertEquals(true, ut);
    }

    @Test
    public void isUnique2() {

        Main test = new Main();

        Map<String, String> firstLastName2 = new HashMap<>();
        firstLastName2.put("Marty", "Stepp");
        firstLastName2.put("Stuart", "Step");
        firstLastName2.put("Jessica", "Miller");
        firstLastName2.put("Amanda", "Miller");
        firstLastName2.put("Hal", "Perkins");

        boolean ut = test.isUnique(firstLastName2);
        assertEquals(false, ut);
    }
}