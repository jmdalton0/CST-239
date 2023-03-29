package com.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class HealthTest {

    @Test
    public void testEquals() {
        Health h1 = new Health();
        Health h2 = h1.copy();

        assertTrue(h1.equals(h2));
    }
    
    @Test
    public void testCopy() {
        Health h1 = new Health();
        Health h2 = h1.copy();

        assertEquals(h1, h2);
    }
}


