package com.epam.florist.creator;

import com.epam.florist.entity.Flower;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FlowerFactory {
    private static Flower[] flower = {new Flower("tulip", BigDecimal.valueOf(200), 35, LocalDate.of(2015, 6, 7)),
            new Flower("rose", BigDecimal.valueOf(300), 10, LocalDate.of(2015, 6, 5)),
            new Flower("rose", BigDecimal.valueOf(300), 20, LocalDate.of(2015, 6, 3)),
            new Flower("rose", BigDecimal.valueOf(300), 30, LocalDate.of(2015, 6, 2)),
            new Flower("rose", BigDecimal.valueOf(300), 40, LocalDate.of(2015, 6, 1)),
            new Flower("rose", BigDecimal.valueOf(300), 50, LocalDate.of(2015, 6, 5))};

    public static Flower[] getFlower() {
        return flower;
    }
}