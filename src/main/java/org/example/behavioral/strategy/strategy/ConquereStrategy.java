package org.example.behavioral.strategy.strategy;


import org.example.behavioral.strategy.EnumClothesThickness;
import org.example.behavioral.strategy.EnumShipMaterialType;

public interface ConquereStrategy {
    void conquere(EnumClothesThickness enumClothesThickness, EnumShipMaterialType enumShipMaterialType );
}
