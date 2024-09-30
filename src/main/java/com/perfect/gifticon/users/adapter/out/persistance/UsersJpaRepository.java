package com.perfect.gifticon.users.adapter.out.persistance;

import com.perfect.gifticon.users.domain.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersJpaRepository extends JpaRepository<UsersEntity, Long> {

    Optional<UsersEntity> findById(Long usersId);

}
