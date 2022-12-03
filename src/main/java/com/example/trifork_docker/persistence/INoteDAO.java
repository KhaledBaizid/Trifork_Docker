package com.example.trifork_docker.persistence;

import com.example.trifork_docker.model.Note;

public interface INoteDAO {

    void insertNote(Note note);
}