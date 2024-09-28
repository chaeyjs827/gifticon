package com.perfect.gifticon.gifticon.port.in;

import com.perfect.gifticon.gifticon.domain.vo.GifticonSaveCommand;

public interface SaveGifticonUseCase {

    void registerGifticon(GifticonSaveCommand gifticonSaveCommand);

}
