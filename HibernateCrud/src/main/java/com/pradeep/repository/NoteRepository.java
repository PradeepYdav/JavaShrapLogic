package com.pradeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.model.Notes;


@Repository
public interface NoteRepository  extends JpaRepository<Notes, Long>{

}
