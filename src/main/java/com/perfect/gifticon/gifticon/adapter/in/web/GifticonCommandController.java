package com.perfect.gifticon.gifticon.adapter.in.web;

import com.perfect.gifticon.common.annotation.WebAdapter;
import com.perfect.gifticon.gifticon.adapter.dto.request.GifticonCreateRequest;
import com.perfect.gifticon.gifticon.domain.vo.GifticonSaveCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@WebAdapter
@RequestMapping("/api/gifticon")
public class GifticonCommandController {

    /**
     * 1. Web Adapter 에서 사용되는 Request DTO 생성
     * 2. Web Adapter 에서 사용되는 Response DTO 생성
     * 3. Domain 계층에서 사용되는 VO 생성(xxComand) 생성
     * 4. Domain 계층에 Entity 생성(xxEntity)
     * 5. Domain 계층에 Aggregate 생성(xxAggregate)
     */
    @PostMapping("")
    public ResponseEntity<?> postGifticon(@RequestBody GifticonCreateRequest gifticonCreateRequest) {
        GifticonSaveCommand gifticonSaveCommand = GifticonSaveCommand.builder()

                .build();

        return null;
    }


}
