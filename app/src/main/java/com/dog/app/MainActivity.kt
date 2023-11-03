package com.dog.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dog.app.adapter.DogAdapter
import com.dog.app.data.DataSource

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var dogAdapter: DogAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.recycler_view_dog)

        dogAdapter = DogAdapter(dogs = DataSource().loadDog())
        recyclerView.adapter = dogAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}