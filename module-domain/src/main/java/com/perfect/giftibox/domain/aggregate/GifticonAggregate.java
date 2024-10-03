package com.perfect.giftibox.domain.aggregate;

import com.perfect.giftibox.domain.vo.GifticonSaveCommand;
import lombok.Value;

public class GifticonAggregate {

    private GifticonId gifticonId;

    public void saveGifticon(GifticonSaveCommand gifticonSaveCommand) {
        /** [중요] Aggregate 는 다른 Aggregate 를 호출하면 안됨
         * 왜? Aggregate 간의 결합도를 낮추기 위해서!! OutbuondPort 를 사용하면 문제 없지?
         * 1. 시스템 일관성 유지 : 서로 독립적인 상태를 관리하여 전체 시스템의 일관성을 높입니다.
         * 2. 유연성 : Aggregate를 독립적으로 변경하거나 교체할 수 있어 시스템의 유연성을 향상시킵니다.
         * 3. 단일 책임 원칙 : 각 Aggregate는 자신의 비즈니스 규칙과 상태만을 책임지게 되어 코드의 가독성과 유지보수성이 좋아집니다.
         * 4. 테스트 용이성 : 각 Aggregate를 독립적으로 테스트할 수 있어, 테스트가 쉬워짐
         */


    }

    /**
     * 식별자를 inner class 로 정의하는 이유
     * 1. 엔티티의 식별자를 명시적으로 캡슐화
     *  -> DDD에선 aggregate나 service에 여러 로직이 포함되는데, 이때 식별자를 명시적으로 사용함으로써 오류를 방지할 수 있음
     *  -> Entity에 강하게 결합된 일종의 값 객체라는 의도를 명확히 드러냄
     * 2. 타입 안정성을 보장
     *  -> 추후 타입 변경 시 쉽게 변경 가능 (ex. Long -> UUID 로 변경 시 식별자 클래스만 변경하면 됨)
     */
    @Value
    public static class GifticonId {
        private Long value;
    }


}
