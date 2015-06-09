package com.epam.florist;

import com.epam.florist.creator.BouquetFactory;
import com.epam.florist.entity.Bouquet;
import com.epam.florist.entity.Flower;
import com.epam.florist.logic.OperationsOnBouquet;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = BouquetFactory.createBouquet();
        System.out.println("Flower bouquet: " + bouquet);
        System.out.println("\nTotal price: " + bouquet.getPrice());
        List<Flower> foundFlowerBasket = OperationsOnBouquet.searchFlowersByStalkLength(bouquet, 10, 30);
        System.out.println("\nFound flowers: " + foundFlowerBasket);
        System.out.println("\nSorting flowers by freshness: " + OperationsOnBouquet.sortFlowers(bouquet));
        System.out.println("\nSorting accessories by name: " + OperationsOnBouquet.sortAccessories(bouquet));
    }
}