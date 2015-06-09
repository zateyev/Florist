package com.epam.florist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Appraisable {
    private final List<BouquetPart> bouquet;

    public Bouquet(List<BouquetPart> bouquet) {
        this.bouquet = bouquet;
    }

    public List<BouquetPart> getBouquet() {
        return bouquet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bouquet)) return false;
        Bouquet bouquet1 = (Bouquet) o;
        return !(getBouquet() != null ? !getBouquet().equals(bouquet1.getBouquet()) : bouquet1.getBouquet() != null);
    }

    @Override
    public int hashCode() {
        return getBouquet() != null ? getBouquet().hashCode() : 0;
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