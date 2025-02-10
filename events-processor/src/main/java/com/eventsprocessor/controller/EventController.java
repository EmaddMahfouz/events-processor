package com.eventsprocessor.controller;

import com.eventsprocessor.entity.Event;
import com.eventsprocessor.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
@RequiredArgsConstructor
public class EventController {

    @PostMapping("/event")
    public ResponseEntity<String> createEvent(@RequestBody Event event) {

        return ResponseEntity.ok("Event created successfully");
    }



}
