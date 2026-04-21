package com.miyuudev.event_api.domain.address;

import java.util.UUID;

public record AddressRequestDTO(String city, String uf, UUID eventId) {
    
} 
