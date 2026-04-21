package com.miyuudev.event_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miyuudev.event_api.domain.address.Address;
import com.miyuudev.event_api.domain.address.AddressRequestDTO;
import com.miyuudev.event_api.services.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {

        this.addressService = addressService;
    }

    public ResponseEntity<Address> create(@RequestBody AddressRequestDTO body) {

        Address address = addressService.create(body);

        return ResponseEntity.ok(address);
    }

}
