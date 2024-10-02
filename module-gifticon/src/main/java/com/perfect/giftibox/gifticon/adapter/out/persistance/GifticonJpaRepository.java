package com.perfect.giftibox.gifticon.adapter.out.persistance;


import com.perfect.giftbox.domain.entity.GifticonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface GifticonJpaRepository extends JpaRepository<GifticonEntity, Long> {
}
