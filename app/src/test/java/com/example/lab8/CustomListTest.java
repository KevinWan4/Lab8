package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Cowgary", "Alberta"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City a = new City("Cowgary", "Alberta");
        City b = new City("Edmutton", "Alberta");
        City c = new City("cowgary", "Alberta");
        City d = new City("Cowgary", "alberta");
        list.addCity(a);
        list.addCity(b);
        assertTrue(list.hasCity(a));
        assertTrue(list.hasCity(b));
        assertFalse(list.hasCity(c));
        assertFalse(list.hasCity(d));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City a = new City("Cowgary", "Alberta");
        City b = new City("Edmutton", "Alberta");
        list.addCity(a);
        list.addCity(b);
        list.deleteCity(a);
        assertFalse(list.hasCity(a));
    }

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
}
