package com.pallavi.project.AirBnb.dto;

import com.pallavi.project.AirBnb.entity.Hotel;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class RoomDto {
    private Long id;
    private String type;
    private BigDecimal basePrice;
    private String[] photos;
    private String[] amenities;
//    private List<String> amenities;
//    private List<String> photos;
    private Integer totalCount;
    private Integer capacity;
}
