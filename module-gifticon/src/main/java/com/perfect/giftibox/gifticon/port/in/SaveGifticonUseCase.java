package com.perfect.giftibox.gifticon.port.in;

import com.perfect.giftbox.domain.vo.GifticonSaveCommand;

public interface SaveGifticonUseCase {

    void registerGifticon(GifticonSaveCommand gifticonSaveCommand);

}
