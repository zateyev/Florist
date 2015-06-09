package com.epam.florist.entity;

import java.math.BigDecimal;
import java.util.Comparator;

public abstract class BouquetPart implements Appraisable {
    private String name;
    public static Comparator<BouquetPart> Name_Order = new Comparator<BouquetPart>() {
        @Override
        public int compare(BouquetPart b1, BouquetPart b2) {
            return b1.name.compareTo(b2.name);
        }
    };
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
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (!(otherObj instanceof BouquetPart)) return false;
        BouquetPart that = (BouquetPart) otherObj;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return !(getPrice() != null ? !getPrice().equals(that.getPrice()) : that.getPrice() != null);
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nАксессуар: " + name + ", Цена: " + price;
    }
}