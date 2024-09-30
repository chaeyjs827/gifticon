package com.perfect.gifticon.users.domain;

import lombok.Value;

public class UsersAggregate {


    @Value
    private static class UsersId {
        private Long value;
    }

}
