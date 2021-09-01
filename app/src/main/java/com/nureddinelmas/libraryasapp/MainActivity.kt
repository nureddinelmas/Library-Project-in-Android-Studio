package com.nureddinelmas.libraryasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.nureddinelmas.libraryasapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bookList: ArrayList<Books>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        bookList = ArrayList<Books>()

        // Data

        val turkiet = Books(141,"Turkiet", "Nureddin",2017)
        val sverige = Books(142,"Sverige", "Lena", 2021)


        bookList.add(turkiet)
        bookList.add(sverige)


        // Adapter

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, bookList.map { books -> books.name})

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener(parent, view, position, id ->
        val intent = Intent())




    }
}