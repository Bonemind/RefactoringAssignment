package com.fontys.softwarecraftsmanship.parts;

import com.fontys.softwarecraftsmanship.Part;
import wrappers.doubles.ProcessorSpeedWrapper;

/**
 * Created by Subhi on 13-Apr-16.
 */
public class Processor extends Part{
    private ProcessorSpeedWrapper processorSpeed;

    public Processor(String title, double price, double speed) {
        super(title, price);
        this.processorSpeed = new ProcessorSpeedWrapper(speed);
    }
}
