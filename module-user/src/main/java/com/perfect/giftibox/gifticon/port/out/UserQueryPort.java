package com.perfect.giftibox.gifticon.port.out;

import com.perfect.giftbox.domain.entity.UserEntity;

public interface UserQueryPort {

    UserEntity getUsers(Long userId);

}
