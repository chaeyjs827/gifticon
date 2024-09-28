package com.perfect.gifticon.gifticon.domain.vo;

import jakarta.validation.constraints.NotNull;

public record GifticonSaveCommand(
        @NotNull Long usersId
) {

}
