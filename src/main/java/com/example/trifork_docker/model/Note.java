package com.example.trifork_docker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String note_content;

    public Note(String note_content) {
        this.note_content = note_content;
    }

    public Note() {
    }
}
