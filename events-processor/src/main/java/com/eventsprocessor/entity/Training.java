package com.eventsprocessor.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "training")
public class Training {
    @Id
    @Column(name = "training_id", nullable = false, unique = true)
    private String trainingId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "duration", nullable = false)
    private int duration;  // Duration in minutes

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
