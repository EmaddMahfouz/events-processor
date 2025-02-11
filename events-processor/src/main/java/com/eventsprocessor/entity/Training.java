package com.eventsprocessor.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "training")
public class Training {
    @Id
    @Column(name = "training_id", nullable = false, unique = true)
    private Long trainingId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "duration", nullable = false)
    private int duration;  // Duration in minutes

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}