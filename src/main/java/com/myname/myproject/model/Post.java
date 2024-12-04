package com.myname.myproject.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class  Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String status;
    private String images;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters
}
