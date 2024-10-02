package com.perfect.giftibox.gifticon.adapter.out.persistance;

import com.perfect.giftbox.domain.vo.GifticonSaveCommand;
import com.perfect.giftibox.gifticon.port.out.GifticonCommandPort;
import org.springframework.stereotype.Repository;

@Repository
public class GifticonCommandRepository implements GifticonCommandPort {

    private final GifticonJpaRepository gifticonJpaRepository;

    public GifticonCommandRepository(GifticonJpaRepository gifticonJpaRepository) {
        this.gifticonJpaRepository = gifticonJpaRepository;
    }

    @Override
    public void saveGifticon(GifticonSaveCommand gifticonSaveCommand) {

    }
}
