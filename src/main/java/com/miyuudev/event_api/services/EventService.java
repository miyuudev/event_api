package com.miyuudev.event_api.services;

import java.sql.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.miyuudev.event_api.domain.event.Event;
import com.miyuudev.event_api.domain.event.EventRequestDTO;
import com.miyuudev.event_api.repositories.EventRepository;

@Service
public class EventService {

    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public Event createEvent(EventRequestDTO data) {
        String imgUrl = null;

        if(data.image() != null){
            imgUrl = this.uploadImg(data.image());
        }

        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImgUrl(imgUrl);

        return repository.save(newEvent);
    }
    
    private String uploadImg(MultipartFile multipartFile){
        return "";
    }
}
