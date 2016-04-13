package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parts.Casing;
import com.fontys.softwarecraftsmanship.parts.Memory;
import com.fontys.softwarecraftsmanship.parts.Motherboard;
import com.fontys.softwarecraftsmanship.parts.Processor;
import wrappers.doubles.DoubleWrapper;
import wrappers.lists.ClassList;
import wrappers.lists.PartList;

import java.util.*;

public class Computer {
    
    PartList parts = new PartList();
    
    public int NumberOfParts() {
        return parts.size();
    }
    
    public void AddPart(Part part) {
        if (part == null) {
            return;
        }
        parts.add(part);
    }
    
    public double GetPrice() {
        DoubleWrapper price = new DoubleWrapper(0.0);
        
        for (int i = 0; i < NumberOfParts(); i++) {
            Part part = parts.get(i);
            price.add(part.GetPrice());
        }
        
        return price.getValue();
    }
    
    public boolean IsComplete() {
        ClassList presentClasses = new ClassList();
        // Build a list of partclasses present
        for (Part part : parts) {
            presentClasses.add(part.getClass());
        }

        ClassList requiredClasses = new ClassList();

        // Build a list of partclasses required
        requiredClasses.addAll(Arrays.asList(Motherboard.class, Processor.class, Memory.class, Casing.class));

        // Removing all presentclasses from requiredclasses means that any classes that were required and not
        // in the parts list would still be there, thus requiredclasses would not be empty
        requiredClasses.removeAll(presentClasses);

        // If requiredclasses is empty all required parts would be there
        return requiredClasses.isEmpty();
    }
}
