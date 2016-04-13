package com.fontys.softwarecraftsmanship.parts;

import com.fontys.softwarecraftsmanship.Part;
import wrappers.strings.SubtypeWrapper;

/**
 * Created by Subhi on 13-Apr-16.
 */
public class Subtypeable extends Part{
    private SubtypeWrapper subtypeWrapper;

    public Subtypeable(String title, double price, String subtype) {
        super(title, price);
        this.subtypeWrapper = new SubtypeWrapper(subtype);
    }
}
