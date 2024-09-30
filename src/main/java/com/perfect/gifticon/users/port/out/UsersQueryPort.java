package com.perfect.gifticon.users.port.out;

import com.perfect.gifticon.users.domain.entity.UsersEntity;

public interface UsersQueryPort {

    UsersEntity getUsers(Long userId);

}
