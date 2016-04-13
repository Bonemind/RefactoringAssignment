package com.fontys.softwarecraftsmanship;

import wrappers.doubles.PriceWrapper;
import wrappers.strings.TitleWrapper;

public abstract class Part {
    
    private final TitleWrapper title;
    private final PriceWrapper price;

    // Default constructor
    public Part(String title, double price) {
        this.title = new TitleWrapper(title);
        this.price = new PriceWrapper(price);
    }
    
    public double GetPrice() {
        return price.getValue();
    }
}