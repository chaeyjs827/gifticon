package com.perfect.giftibox.gifticon.port.in;

import com.perfect.giftibox.domain.vo.GifticonSaveCommand;

public interface SaveGifticonUseCase {

    void registerGifticon(GifticonSaveCommand gifticonSaveCommand);

}
