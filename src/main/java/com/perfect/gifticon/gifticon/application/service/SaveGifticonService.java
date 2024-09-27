package com.perfect.gifticon.gifticon.application.service;

import com.perfect.gifticon.gifticon.port.out.GifticonCommandPort;
import com.perfect.gifticon.gifticon.port.in.SaveGifticonUseCase;

public class SaveGifticonService implements SaveGifticonUseCase {

    private final GifticonCommandPort gifticonCommandPort;

    public SaveGifticonService(GifticonCommandPort gifticonCommandPort) {
        this.gifticonCommandPort = gifticonCommandPort;
    }
}
