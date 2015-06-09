package com.epam.florist.creator;

import com.epam.florist.entity.Bouquet;

public class BouquetFactory {
    private static Bouquet bouquet = new Bouquet();

    public static Bouquet createBouquet() {
        for (int i = 0; i < FlowerFactory.getFlower().length; i++) {
            bouquet.getBouquet().add(FlowerFactory.getFlower()[i]);
        }
        for (int i = 0; i < AccessoryFactory.getAccessory().length; i++) {
            bouquet.getBouquet().add(AccessoryFactory.getAccessory()[i]);
        }
        return bouquet;
    }
}