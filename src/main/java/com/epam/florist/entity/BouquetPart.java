package com.epam.florist.entity;

import java.math.BigDecimal;

public abstract class BouquetPart implements Appraisable {
    private String name;
    private BigDecimal price;

    public BouquetPart() {
    }

    public BouquetPart(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nАксессуар: " + name + ", Цена: " + price;
    }
}