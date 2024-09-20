package com.perfect.gifticon.gifticon.adapter.out.persistance;

import org.springframework.stereotype.Repository;

@Repository
public class GifticonCommandRepository implements GifticonCommandPort {

    private final GifticonJpaRepository gifticonJpaRepository;

    public GifticonCommandRepository(GifticonJpaRepository gifticonJpaRepository) {
        this.gifticonJpaRepository = gifticonJpaRepository;
    }

    @Override
    public void test() {

    }
}
