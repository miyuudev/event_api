package com.miyuudev.event_api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miyuudev.event_api.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID>{

}
