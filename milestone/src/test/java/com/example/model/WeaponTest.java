package com.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class WeaponTest {

    @Test
    public void testEquals() {
        Weapon w1 = new Weapon();
        Weapon w2 = w1.copy();

        assertTrue(w1.equals(w2));
    }
    
    @Test
    public void testCopy() {
        Weapon w1 = new Weapon();
        Weapon w2 = w1.copy();

        assertEquals(w1, w2);
    }
}
