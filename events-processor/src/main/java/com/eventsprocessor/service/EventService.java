package com.eventsprocessor.service;

import com.eventsprocessor.entity.Event;
import com.eventsprocessor.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class EventService {


//    private EventRepository eventRepository;
//    public void processEvent(Event event) {
//        switch (event.getEventType()) {
//            case "app_launch":
//                handleAppLaunch(event);
//                break;
//            case "training_program_started":
//                handleTrainingProgramStarted(event);
//                break;
//            case "training_program_finished":
//                handleTrainingProgramFinished(event);
//                break;
//            case "training_program_cancelled":
//                handleTrainingProgramCancelled(event);
//                break;
//            default:
//                handleUnknownEvent(event);
//                break;
//        }
//    }
//
//    private void handleUnknownEvent(Event event) {
//    }
//
//    private void handleTrainingProgramCancelled(Event event) {
//    }
//
//    private void handleTrainingProgramFinished(Event event) {
//    }
//
//    private void handleTrainingProgramStarted(Event event) {
//    }
//
//    private void handleAppLaunch(Event event) {
//    }




}