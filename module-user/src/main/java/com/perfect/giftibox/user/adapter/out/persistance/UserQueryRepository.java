package com.perfect.giftibox.user.adapter.out.persistance;


import com.perfect.giftibox.domain.entity.UserEntity;

public class UserQueryRepository {

    private final UserJpaRepository userJpaRepository;

    public UserQueryRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    public UserEntity getUsers(Long usersId) {
        return userJpaRepository.findById(usersId).orElse(null);
    }

}
