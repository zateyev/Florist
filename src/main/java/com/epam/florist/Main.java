package com.epam.florist;

import com.epam.florist.creator.BouquetFactory;
import com.epam.florist.entity.Bouquet;
import com.epam.florist.entity.BouquetPart;
import com.epam.florist.entity.Flower;
import com.epam.florist.logic.Actions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = BouquetFactory.createBouquet(6, 2);
        System.out.println("Flower bouquet: " + bouquet);
        System.out.println("\nTotal price: " + bouquet.getPrice());
        List<Flower> foundFlowerBasket = Actions.searchFlowersByStalkLength(bouquet, 12, 16);
        System.out.println("\nFound flowers: " + foundFlowerBasket);
        System.out.println("\nSorting flowers by freshness: " + Actions.sortFlowers(bouquet));
        Collections.sort(bouquet.getBouquet(), Comparator.comparing(BouquetPart::getPrice));
        System.out.println("\nSorting bouquet parts by price: " + bouquet);
        Collections.sort(bouquet.getBouquet(), BouquetPart.Name_Order);
    }
}