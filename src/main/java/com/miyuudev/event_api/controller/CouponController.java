package com.miyuudev.event_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miyuudev.event_api.domain.coupon.Coupon;
import com.miyuudev.event_api.domain.coupon.CouponRequestDTO;
import com.miyuudev.event_api.services.CouponService;

@ResponseBody
@RequestMapping("/api/coupon")
public class CouponController {

    private final CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    public ResponseEntity<Coupon> create(@RequestBody CouponRequestDTO body) {
        Coupon coupon = this.couponService.create(body);
        return ResponseEntity.ok(coupon);
    }

}
