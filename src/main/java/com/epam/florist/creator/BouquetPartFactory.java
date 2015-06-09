package com.epam.florist.creator;

import com.epam.florist.entity.Accessory;
import com.epam.florist.entity.BouquetPart;
import com.epam.florist.entity.Flower;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BouquetPartFactory {
    public static List<BouquetPart> createBouquetPart(int flowerCount, int accessoryCount) {
        List<BouquetPart> bouquetParts = new ArrayList<BouquetPart>();
        for (int i = 0; i < flowerCount; i++) {
            bouquetParts.add(new Flower("rose" + i, BigDecimal.valueOf(200 + i * 10),
                    10 + i * 2, LocalDate.of(2015, 6, 1 + i)));
        }
        for (int i = 0; i < accessoryCount; i++) {
            bouquetParts.add(new Accessory("tape" + i, BigDecimal.valueOf(50 + i * 5)));
        }
        return bouquetParts;
    }
}
