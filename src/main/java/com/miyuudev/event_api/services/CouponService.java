package com.miyuudev.event_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.miyuudev.event_api.domain.coupon.Coupon;
import com.miyuudev.event_api.domain.coupon.CouponRequestDTO;
import com.miyuudev.event_api.domain.event.Event;
import com.miyuudev.event_api.repositories.CouponRepository;
import com.miyuudev.event_api.repositories.EventRepository;

@Service
public class CouponService {

    private final CouponRepository couponRepo;
    private final EventRepository eventRepo;

    public CouponService(CouponRepository couponRepo, EventRepository eventRepo) {
        this.couponRepo = couponRepo;
        this.eventRepo = eventRepo;
    }

        public Coupon create(CouponRequestDTO data) {
        Event event = eventRepo.findById(data.eventId())
            .orElseThrow(() -> new RuntimeException("Event not found"));

        Coupon coupon = new Coupon();
        coupon.setId(UUID.randomUUID());
        coupon.setCode(data.code());
        coupon.setDiscount(data.discount());
        coupon.setValid(data.valid());
        coupon.setEvent(event);

        return couponRepo.save(coupon);
    }
}
