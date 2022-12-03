package com.example.trifork_docker.api;

import com.example.trifork_docker.model.Note;
import com.example.trifork_docker.persistence.INoteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableJpaRepositories( {"com.example.trifork_assignment.repository"})
public class NoteControllerAPI {

    private final INoteDAO noteDAO;

    @Autowired

    public NoteControllerAPI(INoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    @PostMapping("/note")
    void newBook(@RequestBody String note_content) {
        noteDAO.insertNote(new Note(note_content));
    }

  /*  @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }*/
}

