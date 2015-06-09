package com.epam.florist.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Flower extends BouquetPart implements Comparable<Flower> {
    private int stalkLength;
    private LocalDate deliveryDate;

    public Flower() {
        super();
    }

    public Flower(String name, BigDecimal price, int stalkLength, LocalDate deliveryDate) {
        super(name, price);
        this.stalkLength = stalkLength;
        this.deliveryDate = deliveryDate;
    }

    public int getStalkLength() {
        return stalkLength;
    }

    public void setStalkLength(int stalkLength) {
        this.stalkLength = stalkLength;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int compareTo(Flower compareFlower) {
        int compareDeliveryDate = compareFlower.getDeliveryDate().compareTo(getDeliveryDate());
        if (compareDeliveryDate != 0) {
            return compareDeliveryDate;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\nЦветок: " + getName() + ", Цена: " + getPrice() + ", Длина стебля: " + stalkLength +
                ", Дата поставки: " + deliveryDate;
    }
}