package com.eventsprocessor.repository;


import com.eventsprocessor.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}
