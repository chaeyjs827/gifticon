package com.perfect.gifticon.users.domain.entity;

import com.perfect.gifticon.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class UsersEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "status", nullable = false)
    private String status;

    @Builder
    public UsersEntity(String email, String password, String status) {
        this.email = email;
        this.password = password;
        this.status = status;
    }
}

