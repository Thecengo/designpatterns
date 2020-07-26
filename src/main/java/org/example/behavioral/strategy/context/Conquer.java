package org.example.behavioral.strategy.context;

import org.example.behavioral.strategy.EnumClothesThickness;
import org.example.behavioral.strategy.EnumShipMaterialType;
import org.example.behavioral.strategy.strategy.ConquereStrategy;

public class Conquer {

    private ConquereStrategy strategy;
    private EnumShipMaterialType enumShipMaterialType;
    private EnumClothesThickness enumClothesThickness;

    public Conquer(ConquereStrategy strategy, EnumShipMaterialType enumShipMaterialType, EnumClothesThickness enumClothesThickness){
        this.strategy=strategy;
        this.enumShipMaterialType = enumShipMaterialType;
        this.enumClothesThickness = enumClothesThickness;
    }

    public void conquer(){
        strategy.conquere(enumClothesThickness, enumShipMaterialType);
    }

}
