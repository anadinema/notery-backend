package org.bittybit.proj.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity (name = "notes_master")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "note_id")
    private int noteId;

    @Column (name = "user_id")
    private String userId;

    @Column (name = "heading")
    private String noteHeading;

    @Column (name = "content")
    private String noteContent;

}
