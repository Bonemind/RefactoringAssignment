package com.fontys.softwarecraftsmanship.parts;

import com.fontys.softwarecraftsmanship.Part;
import wrappers.strings.StringWrapper;
import wrappers.strings.TypeWrapper;

/**
 * Created by Subhi on 13-Apr-16.
 */
public class Custom extends Subtypeable {
    private TypeWrapper typeWrapper;

    public Custom(String type, String title, double price, String subtype) {
        super(title, price, subtype);
        typeWrapper = new TypeWrapper(type);
    }
}
