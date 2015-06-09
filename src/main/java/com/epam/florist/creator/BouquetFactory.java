package com.epam.florist.creator;

import com.epam.florist.entity.Bouquet;

public class BouquetFactory {
    public static Bouquet createBouquet(int flowerCount, int accessoryCount) {
        return new Bouquet(BouquetPartFactory.createBouquetPart(flowerCount, accessoryCount));
    }
}