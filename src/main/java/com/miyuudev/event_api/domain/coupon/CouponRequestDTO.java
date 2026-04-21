package com.miyuudev.event_api.domain.coupon;

import java.time.LocalDateTime;
import java.util.UUID;

public record CouponRequestDTO(String code, Integer discount, LocalDateTime valid, UUID eventId) {

} 
