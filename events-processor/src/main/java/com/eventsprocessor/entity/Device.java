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
@Table(name = "device")
public class Device {
    @Id
    @Column(name = "device_id", nullable = false, unique = true)
    private String deviceId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "device_type", nullable = false)
    private String deviceType;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
