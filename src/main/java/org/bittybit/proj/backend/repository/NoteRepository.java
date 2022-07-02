package org.bittybit.proj.backend.repository;

import org.bittybit.proj.backend.entity.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note,Integer> {
}
