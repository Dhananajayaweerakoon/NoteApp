package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.notesapp.databinding.ActivityAddnoteBinding

class Addnote : AppCompatActivity() {

    private lateinit var binding: ActivityAddnoteBinding
    private lateinit var db: Notesdb

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddnoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Notesdb(this)

        binding.saveButton.setOnClickListener{
            val title = binding.contentEditText.text.toString()
            val content = binding.contentEditText.text.toString()
            val note = Note(0, title, content)
            db.insertNote(note)
            finish()
            Toast.makeText(this, "Study Plan Saved", Toast.LENGTH_SHORT).show()

        }
    }
}