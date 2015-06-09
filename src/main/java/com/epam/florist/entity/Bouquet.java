package com.epam.florist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Appraisable {
    private final List<BouquetPart> bouquet = new ArrayList<BouquetPart>();

    public List<BouquetPart> getBouquet() {
        return bouquet;
    }

    @Override
    public String toString() {
        return String.valueOf(bouquet);
    }

    public BigDecimal getPrice() {
        BigDecimal totalPrice = new BigDecimal(0);
        for (BouquetPart bouquetPart : this.bouquet) {
            totalPrice = totalPrice.add(bouquetPart.getPrice());
        }
        return totalPrice;
    }
}