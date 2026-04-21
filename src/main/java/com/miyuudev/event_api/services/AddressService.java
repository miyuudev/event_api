package com.miyuudev.event_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.miyuudev.event_api.domain.address.Address;
import com.miyuudev.event_api.domain.address.AddressRequestDTO;
import com.miyuudev.event_api.domain.event.Event;
import com.miyuudev.event_api.repositories.AddressRepository;
import com.miyuudev.event_api.repositories.EventRepository;

@Service
public class AddressService {

    private final AddressRepository addressRepo;
    private final EventRepository eventRepo;

    
    public AddressService(AddressRepository addressRepo, EventRepository eventRepo){
        this.addressRepo = addressRepo;
        this.eventRepo = eventRepo;
    }

    public Address create(AddressRequestDTO data) {

        Event event = eventRepo.findById(data.eventId())
        .orElseThrow(() -> new RuntimeException("Event not found"));
        
        Address address = new Address();
        address.setId(UUID.randomUUID());
        address.setUf(data.uf());
        address.setCity(data.city());
        address.setEvent(event);

        return addressRepo.save(address);
}    

}
