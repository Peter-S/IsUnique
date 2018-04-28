package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> firstLastName1 = new HashMap<>();
        firstLastName1.put("Marty", "Stepp");
        firstLastName1.put("Stuart", "Reges");
        firstLastName1.put("Jessica", "Miller");
        firstLastName1.put("Amanda", "Camp");
        firstLastName1.put("Hal", "Perkins");

        System.out.println("Map values " + firstLastName1);
        System.out.println(isUnique(firstLastName1));

        Map<String, String> firstLastName2 = new HashMap<>();
        firstLastName2.put("Marty", "Stepp");
        firstLastName2.put("Stuart", "Step");
        firstLastName2.put("Jessica", "Miller");
        firstLastName2.put("Amanda", "Miller");
        firstLastName2.put("Hal", "Perkins");

        System.out.println("Map values " + firstLastName2);
        System.out.println(isUnique(firstLastName2));
    }

    public static boolean isUnique(Map<String, String> map) {
        HashSet<String> set = new HashSet<>();

        for(String key : map.keySet()) {
            String value = map.get(key);

            if(set.contains(value))
                return false;

            set.add(value);
        }
        return true;
    }
}
