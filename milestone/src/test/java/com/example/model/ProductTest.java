package com.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ProductTest {
    
    @Test
    public void testEquals() {
        Product p1 = new Product();
        Product p2 = p1.copy();

        assertTrue(p1.equals(p2));
    }
    
    @Test
    public void testCopy() {
        Product p1 = new Product();
        Product p2 = p1.copy();

        assertEquals(p1, p2);
    }

}
