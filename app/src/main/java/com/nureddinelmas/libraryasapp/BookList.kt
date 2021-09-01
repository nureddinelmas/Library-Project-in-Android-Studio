package com.nureddinelmas.libraryasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nureddinelmas.libraryasapp.databinding.ActivityBookListBinding

class BookList : AppCompatActivity() {
    private lateinit var binding: ActivityBookListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        // casting

        val intent = intent
        val selectedBookList = intent.getSerializableExtra("books") as Books
    }
}