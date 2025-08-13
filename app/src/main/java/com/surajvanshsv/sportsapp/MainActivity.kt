package com.surajvanshsv.sportsapp

import android.icu.lang.UCharacter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // recycler view
        var recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)

        // data store : list of sports model objects
        var sportsList : ArrayList<SportModel> = ArrayList()
        val sports1 = SportModel(R.drawable.football,"Football")
        val sports2 = SportModel(R.drawable.basketball,"Basketball")
        val sports3 = SportModel(R.drawable.ping,"PingPong")
        val sports4 = SportModel(R.drawable.tennis,"Tennis")
        val sports5 = SportModel(R.drawable.volley,"Volleyball")

        sportsList.add(sports1)
        sportsList.add(sports2)
        sportsList.add(sports3)
        sportsList.add(sports4)
        sportsList.add(sports5)

        //adapter set
        val myAdapter = SportAdapter(sportsList)

        recyclerview.adapter = myAdapter



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}