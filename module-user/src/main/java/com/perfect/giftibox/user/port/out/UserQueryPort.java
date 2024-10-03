package com.perfect.giftibox.user.port.out;

import com.perfect.giftibox.domain.entity.UserEntity;

public interface UserQueryPort {

    UserEntity getUsers(Long userId);

}
