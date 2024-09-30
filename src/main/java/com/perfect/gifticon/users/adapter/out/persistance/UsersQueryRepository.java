package com.perfect.gifticon.users.adapter.out.persistance;

import com.perfect.gifticon.users.domain.entity.UsersEntity;

public class UsersQueryRepository {

    private final UsersJpaRepository usersJpaRepository;

    public UsersQueryRepository(UsersJpaRepository usersJpaRepository) {
        this.usersJpaRepository = usersJpaRepository;
    }

    public UsersEntity getUsers(Long usersId) {
        return usersJpaRepository.findById(usersId).orElse(null);
    }

}
