package com.pallavi.project.AirBnb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

//@Data
//public class HotelSearchRequest {
//    private String city;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    private Integer roomsCount;
//
//    private Integer page=0;
//    private Integer size=10;
//
//}
@Data
public class HotelSearchRequest {
    private String city;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    private Integer roomsCount;
    private Integer page = 0;
    private Integer size = 10;
}
