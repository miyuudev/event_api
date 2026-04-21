package com.miyuudev.event_api.domain.event;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import com.miyuudev.event_api.domain.coupon.Coupon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Event {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private String imgUrl;
    private String eventUrl;
    private Boolean remote;
    private Date date;

    @OneToMany(mappedBy = "event")
    private List<Coupon> coupons;
}
