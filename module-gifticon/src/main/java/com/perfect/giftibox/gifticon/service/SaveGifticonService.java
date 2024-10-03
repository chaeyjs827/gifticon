package com.perfect.giftibox.gifticon.service;

import com.perfect.giftibox.domain.aggregate.GifticonAggregate;
import com.perfect.giftibox.domain.vo.GifticonSaveCommand;
import com.perfect.giftibox.gifticon.port.in.SaveGifticonUseCase;

public class SaveGifticonService implements SaveGifticonUseCase {

    private final GifticonAggregate gifticonCommandPort;

    public SaveGifticonService(GifticonAggregate gifticonCommandPort) {
        this.gifticonCommandPort = gifticonCommandPort;
    }

    @Override
    public void registerGifticon(GifticonSaveCommand gifticonSaveCommand) {
//        1. [todo]유효 회원 확인(Users 인데, 이건 아마 interceptor에서 처리할 듯)
//        UsersEntity usersEntity = usersQueryRepository.getUsers(1L);


//        usersQueryRepository.getUsers(gifticonSaveCommand.usersId());


//        2. 해당 회원의 등록 가능 기프티콘 수 확인(Users 도메인)
//        3. 기프티콘 등록(Gifticon 도메인)
//        4. 해당 회원 기프티콘 등록 수 갱신(Users 도메인)

    }
}
