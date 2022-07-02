package org.bittybit.proj.backend.service;

import org.bittybit.proj.backend.entity.Note;
import org.bittybit.proj.backend.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public Note updateNote(Note note) {
        Note existingNote = noteRepository.findById(note.getNoteId()).orElse(null);
        if (null != existingNote)
        {
            existingNote.setNoteContent(note.getNoteContent());
            existingNote.setNoteHeading(note.getNoteHeading());
            return noteRepository.save(existingNote);
        }
        return null;
    }

    public Optional<Note> findNote(int noteId) {
        return noteRepository.findById(noteId);
    }

    public Iterable<Note> findAllNotes() {
        return noteRepository.findAll();
    }

    public String deleteNote(int noteId) {
        noteRepository.deleteById(noteId);
        return "Note deleted!";
    }
}
