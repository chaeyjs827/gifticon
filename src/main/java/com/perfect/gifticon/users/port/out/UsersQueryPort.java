package com.perfect.gifticon.users.port.out;

import com.perfect.gifticon.users.adapter.out.persistance.entity.Users;

public interface UsersQueryPort {

    Users getUsers(Long userId);

}
