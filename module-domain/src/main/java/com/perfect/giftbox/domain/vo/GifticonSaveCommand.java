package com.perfect.giftbox.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

@Getter
public class GifticonSaveCommand{

    @NotNull
    private final Long usersId;

    @Builder
    public GifticonSaveCommand(Long usersId) {
        this.usersId = usersId;
    }

    public Long usersId() {
        return null;
    }
}
