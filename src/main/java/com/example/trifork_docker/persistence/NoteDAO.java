package com.example.trifork_docker.persistence;

import com.example.trifork_docker.model.Note;
import com.example.trifork_docker.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteDAO implements INoteDAO {

    private NoteRepository noteRepository;

    @Autowired
    public NoteDAO(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }



    @Override
    public void insertNote(Note note) {
        noteRepository.save(note);
    }
}
