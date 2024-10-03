package com.perfect.giftibox.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "gifticon")
@Data
@NoArgsConstructor
public class GifticonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String couponName;

    private String brandName;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Builder
    public GifticonEntity(Long id, String couponName, String brandName, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.couponName = couponName;
        this.brandName = brandName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
