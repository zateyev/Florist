package com.epam.florist.logic;

import com.epam.florist.entity.Accessory;
import com.epam.florist.entity.Bouquet;
import com.epam.florist.entity.BouquetPart;
import com.epam.florist.entity.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperationsOnBouquet {
    public static List<Flower> sortFlowers(Bouquet bouquet) {
        List<Flower> flowers = new ArrayList<Flower>();
        for (BouquetPart bouquetPart : bouquet.getBouquet()) {
            if (bouquetPart instanceof Flower) {
                flowers.add((Flower) bouquetPart);
            }
        }
        Collections.sort(flowers);
        return flowers;
    }

    public static List<Accessory> sortAccessories(Bouquet bouquet) {
        List<Accessory> accessories = new ArrayList<Accessory>();
        for (BouquetPart bouquetPart : bouquet.getBouquet()) {
            if (bouquetPart instanceof Accessory) {
                accessories.add((Accessory) bouquetPart);
            }
        }
        Collections.sort(accessories);
        return accessories;
    }

    public static List<Flower> searchFlowersByStalkLength(Bouquet bouquet, int stalkLength1, int stalkLength2) {
        List<Flower> foundFlowers = new ArrayList<Flower>();
        for (BouquetPart flower : bouquet.getBouquet()) {
            if (flower instanceof Flower) {
                if (((Flower) flower).getStalkLength() >= stalkLength1 && ((Flower) flower).getStalkLength() <= stalkLength2)
                    foundFlowers.add((Flower) flower);
            }
        }
        return foundFlowers;
    }
}
