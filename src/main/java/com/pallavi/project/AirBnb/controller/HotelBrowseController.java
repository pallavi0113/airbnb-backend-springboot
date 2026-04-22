package com.pallavi.project.AirBnb.controller;

import com.pallavi.project.AirBnb.dto.HotelDto;
import com.pallavi.project.AirBnb.dto.HotelInfoDto;
import com.pallavi.project.AirBnb.dto.HotelPriceDto;
import com.pallavi.project.AirBnb.dto.HotelSearchRequest;
import com.pallavi.project.AirBnb.repository.InventoryRepository;
import com.pallavi.project.AirBnb.service.HotelService;
import com.pallavi.project.AirBnb.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {

        var page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }

}
