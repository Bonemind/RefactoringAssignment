package com.fontys.softwarecraftsmanship.parts;

import wrappers.doubles.SizeWrapper;

/**
 * Created by Subhi on 13-Apr-16.
 */
public class Memory extends Subtypeable {
    private SizeWrapper sizeWrapper;

    public Memory(String title, double price, double size, String subtype) {
        super(title, price, subtype);
        sizeWrapper = new SizeWrapper(size);
    }
}
