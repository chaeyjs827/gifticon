package com.perfect.gifticon.gifticon.port.out;

import com.perfect.gifticon.gifticon.domain.vo.GifticonSaveCommand;

public interface GifticonCommandPort {

    void saveGifticon(GifticonSaveCommand gifticonSaveCommand);

}
