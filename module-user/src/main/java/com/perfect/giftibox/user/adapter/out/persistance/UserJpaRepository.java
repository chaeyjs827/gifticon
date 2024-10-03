package com.perfect.giftibox.user.adapter.out.persistance;


import com.perfect.giftibox.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findById(Long usersId);

}
