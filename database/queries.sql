

INSERT INTO user (user_id, email)
VALUES (1, 'john.doe@example.com'),(2, 'alice.smith@example.com');

INSERT INTO device (device_id, user_id, device_type, created_at) VALUES
                                                                     (101, 1, 'Mobile', NOW()),
                                                                     (102, 2, 'Laptop', NOW());
INSERT INTO training (training_id, title, description, duration, created_at) VALUES
                                                                                 (201, 'Java Basics', 'Introduction to Java Programming', 120, NOW()),
                                                                                 (202, 'Spring Boot Advanced', 'Deep dive into Spring Boot framework', 180, NOW());
INSERT INTO event (user_id, device_id, event_type, timestamp, training_id) VALUES
                                                                               (1, 101, 'LOGIN', NOW(), NULL),
                                                                               (1, 101, 'START_TRAINING', NOW(), 201),
                                                                               (2, 102, 'LOGIN', NOW(), NULL),
                                                                               (2, 102, 'START_TRAINING', NOW(), 202);
