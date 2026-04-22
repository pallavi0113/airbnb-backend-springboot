package com.pallavi.project.AirBnb.strategy;

import com.pallavi.project.AirBnb.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(Inventory inventory){
        return inventory.getRoom().getBasePrice();
    }
}
