package com.example.notesapp.data.repository

import com.example.notesapp.data.model.Note

interface NotesRepository {

    fun getNotes() : List<Note>
}