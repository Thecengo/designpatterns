package org.example.behavioral.strategy.context;

import org.example.behavioral.strategy.EnumClothesThickness;
import org.example.behavioral.strategy.EnumShipMaterialType;
import org.example.behavioral.strategy.strategy.ConquereStrategy;
import org.example.behavioral.strategy.strategy.MarsConquereStrategy;
import org.example.behavioral.strategy.strategy.MerkurConquereStrategy;
import org.example.behavioral.strategy.strategy.VenusConquereStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConquerTest {

    @Test
    public void mars_fethi_icin_kıyafet_ve_geminin_malzeme_tipine_gore_strateji_uygulanmali() {
        ConquereStrategy marsConquerStrategy = new MarsConquereStrategy();
        Conquer conquer = new Conquer(marsConquerStrategy,
                EnumShipMaterialType.MULTI_DENSITY_COMPOZIT,
                EnumClothesThickness.THICKNESS_2);
        conquer.conquer();
    }

    @Test
    public void merkur_fethi_icin_kıyafet_ve_geminin_malzeme_tipine_gore_strateji_uygulanmali() {
        ConquereStrategy merkurConquereStrategy = new MerkurConquereStrategy();
        Conquer conquer = new Conquer(merkurConquereStrategy,
                EnumShipMaterialType.CELIK,
                EnumClothesThickness.THICKNESS_3);
        conquer.conquer();
    }

    @Test
    public void venus_fethi_icin_kıyafet_ve_geminin_malzeme_tipine_gore_strateji_uygulanmali() {
        ConquereStrategy venusConquerStrategy = new VenusConquereStrategy();
        Conquer conquer = new Conquer(venusConquerStrategy,
                EnumShipMaterialType.TITANYUM,
                EnumClothesThickness.THICKNESS_1);
        conquer.conquer();
    }

}