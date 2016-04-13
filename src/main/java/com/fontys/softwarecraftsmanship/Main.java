package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parts.Casing;
import com.fontys.softwarecraftsmanship.parts.Memory;
import com.fontys.softwarecraftsmanship.parts.Motherboard;
import com.fontys.softwarecraftsmanship.parts.Processor;

public class Main {

    public static void main(String[] args) {
        
        Computer computer = new Computer();
        
        computer.AddPart(new Casing("Cooler Master Centurion 6", 49.50, "Midi tower"));
        computer.AddPart(new Processor("Intel i7-4790", 295.0, 3.6));
        computer.AddPart(new Memory("G.SKILL Ripjaws X Series", 99.99, 16, "DDR3"));
        computer.AddPart(new Motherboard("MSI H97 PC MATE - Socket 1150 - ATX", 89.0));

        if (computer.IsComplete()) {
            System.out.println("Total price is EUR " + computer.GetPrice());
            return;
        }
        System.out.println("Your computer is not ready yet...");
    }
}
