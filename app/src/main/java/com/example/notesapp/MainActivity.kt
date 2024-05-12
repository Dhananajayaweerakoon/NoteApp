package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notesapp.databinding.ActivityMainBinding
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var db: Notesdb
    private lateinit var noteAdapter: NoteAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       /* db = Notesdb(this)*/

        binding.notesRecyclerView.layoutManager = LinearLayoutManager(this)
       /* binding.notesRecyclerView.adapter = noteAdapter*/

       /* noteAdapter = NoteAdapter(db.getAllNotes(),this)*/
        binding.addButton.setOnClickListener {
            val intent = Intent(this, Addnote::class.java)
            startActivity(intent)
        }
    }
    /*override fun onResume() {
        super.onResume()
        noteAdapter.refreshData(db.getAllNotes())
    }*/


}