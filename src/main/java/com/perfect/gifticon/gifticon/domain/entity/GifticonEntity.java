package com.perfect.gifticon.gifticon.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "gifticon")
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class GifticonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
