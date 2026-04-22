package com.pallavi.project.AirBnb.strategy;

import com.pallavi.project.AirBnb.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
