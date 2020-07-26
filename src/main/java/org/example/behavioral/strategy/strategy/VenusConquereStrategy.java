package org.example.behavioral.strategy.strategy;

import org.example.behavioral.strategy.EnumClothesThickness;
import org.example.behavioral.strategy.EnumShipMaterialType;

public class VenusConquereStrategy implements ConquereStrategy {

    @Override
    public void conquere(EnumClothesThickness enumClothesThickness, EnumShipMaterialType enumShipMaterialType) {
        System.out.println("Venus için " + enumClothesThickness.toString() + " " + enumShipMaterialType.toString()
                + " stratejisi uygulandı");
    }
}
