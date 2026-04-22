package com.pallavi.project.AirBnb.strategy;


import com.pallavi.project.AirBnb.entity.Inventory;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.DayOfWeek;

@RequiredArgsConstructor
public class HolidayPricingStrategy implements PricingStrategy{

    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        BigDecimal price = wrapped.calculatePrice(inventory);
        DayOfWeek day = inventory.getDate().getDayOfWeek();
        boolean isHoliday = day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
        if (isHoliday) {
            price = price.multiply(BigDecimal.valueOf(1.25));
        }
        return price;
    }
}
