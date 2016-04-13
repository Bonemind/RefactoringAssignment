package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parts.Casing;
import com.fontys.softwarecraftsmanship.parts.Memory;
import com.fontys.softwarecraftsmanship.parts.Motherboard;
import com.fontys.softwarecraftsmanship.parts.Processor;

import static org.junit.Assert.*;
import java.util.*;

public class PartTest {
    
    /**
     * Test of GetPrice method.
     */
    @org.junit.Test
    public void testGetPrice() {
        final double DEFAULT_PRICE = 10.0;
        List<Part> parts = new ArrayList<>();
        
        parts.add(new Casing("", DEFAULT_PRICE, ""));
        parts.add(new Processor("", DEFAULT_PRICE, 0.0));
        parts.add(new Memory("", DEFAULT_PRICE, 0, ""));
        parts.add(new Motherboard("", DEFAULT_PRICE));
        
        for (Part p : parts) {
            assertEquals(DEFAULT_PRICE, p.GetPrice(), 0.0);
        }
    }
}
