package com.perfect.gifticon.gifticon.adapter.out.persistance;


import com.perfect.gifticon.gifticon.domain.entity.GifticonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface GifticonJpaRepository extends JpaRepository<GifticonEntity, Long> {
}
