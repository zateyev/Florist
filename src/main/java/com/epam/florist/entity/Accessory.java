package com.epam.florist.entity;

import java.math.BigDecimal;

public class Accessory extends BouquetPart implements Comparable<Accessory> {
    public Accessory() {
        super();
    }

    public Accessory(String name, BigDecimal price) {
        super(name, price);
    }

    public int compareTo(Accessory accessory) {
        int compareName = getName().compareTo(accessory.getName());
        if (compareName != 0) {
            return compareName;
        }
        return 0;
    }
}