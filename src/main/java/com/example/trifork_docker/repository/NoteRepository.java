package com.example.trifork_docker.repository;

import com.example.trifork_docker.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NoteRepository extends JpaRepository<Note,String> {

}
