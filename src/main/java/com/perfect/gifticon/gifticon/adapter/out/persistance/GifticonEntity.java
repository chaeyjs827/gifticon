package com.perfect.gifticon.gifticon.adapter.out.persistance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gifticon")
@Data
@AllArgsConstructor
@NoArgsConstructor
class GifticonEntity {

    @Id
    @GeneratedValue
    private Long id;

}
