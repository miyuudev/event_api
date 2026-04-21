package com.miyuudev.event_api.domain.coupon;

import java.util.UUID;

import com.miyuudev.event_api.domain.event.Event;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private LocalDateTime valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
