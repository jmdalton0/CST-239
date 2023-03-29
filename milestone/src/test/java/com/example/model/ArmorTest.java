package com.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArmorTest {

    @Test
    public void testEquals() {
        Armor a1 = new Armor();
        Armor a2 = a1.copy();

        assertTrue(a1.equals(a2));
    }
    
    @Test
    public void testCopy() {
        Armor a1 = new Armor();
        Armor a2 = a1.copy();

        assertEquals(a1, a2);
    }
}

