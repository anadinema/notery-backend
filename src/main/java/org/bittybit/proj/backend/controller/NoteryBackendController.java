package org.bittybit.proj.backend.controller;

import org.bittybit.proj.backend.entity.Note;
import org.bittybit.proj.backend.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController(value = "Backend Service")
public class NoteryBackendController {

    @Autowired
    private NoteService noteService;

    @GetMapping(path = "/notes/all", produces = "application/json")
    Iterable<Note> fetchAllNotes() {
        return noteService.findAllNotes();
    }

    @GetMapping(path = "/notes/{noteId}", produces = "application/json")
    Optional<Note> fetchNoteById(@PathVariable int noteId) {
        return noteService.findNote(noteId);
    }

    @PostMapping(path = "/notes/new", consumes = "application/json", produces = "application/json")
    Note addNewNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    @DeleteMapping(path = "/notes/delete/{noteId}", produces = "application/json")
    String addNewNote(@PathVariable int noteId) {
        return noteService.deleteNote(noteId);
    }

    @PutMapping(path = "/notes/update", consumes = "application/json", produces = "application/json")
    Note updateNote(@RequestBody Note note) {
        return noteService.updateNote(note);
    }



}
