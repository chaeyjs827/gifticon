package com.perfect.giftbox.domain.aggregate;

import lombok.Value;

public class UserAggregate {


    @Value
    private static class UsersId {
        private Long value;
    }

}
