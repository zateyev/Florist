package com.epam.florist.creator;

import com.epam.florist.entity.Accessory;

import java.math.BigDecimal;

public class AccessoryFactory {
    private final static Accessory[] accessory = {new Accessory("tape", BigDecimal.valueOf(26)), new Accessory("package", BigDecimal.valueOf(20)),
            new Accessory("ribbon", BigDecimal.valueOf(30))};

    public final static Accessory[] getAccessory() {
        return accessory;
    }
}
