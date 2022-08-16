package com.example.notesapp.data.repository

import com.example.notesapp.data.model.Note
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

class NotesRepositoryImp(
    val database: FirebaseFirestore
) : NotesRepository {

    override fun getNotes(): List<Note> {
        //we will get data from firebase
        return arrayListOf(
            Note(
                id = "fdasf",
                text = "Note 1",
                date = Date()
            ),
            Note(
                id = "fdasf",
                text = "Note 2",
                date = Date()
            ),
            Note(
                id = "fdasf",
                text = "Note 3",
                date = Date()
            )
        )
    }
}