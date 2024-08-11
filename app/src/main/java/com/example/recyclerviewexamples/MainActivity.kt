package com.example.recyclerviewexamples

import android.os.Bundle

import androidx.appcompat.widget.SearchView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
        private lateinit var recyclerView: RecyclerView

        private lateinit var searchview: SearchView
        private  var mList= ArrayList<LanguageData>()
        private lateinit var adapter: LanguageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
       searchview= findViewById(R.id.searchViewMain)


        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        addDatatoList()

        adapter= LanguageAdapter(mList)
        recyclerView.adapter=adapter




    }

    private fun addDatatoList(){

        mList.add(LanguageData("Java",R.drawable.realltr))
        mList.add(LanguageData("C",R.drawable.realltr))
        mList.add(LanguageData("C++",R.drawable.realltr))
        mList.add(LanguageData("Python",R.drawable.realltr))
        mList.add(LanguageData("Kotlin",R.drawable.realltr))
        mList.add(LanguageData("Java",R.drawable.realltr))
        mList.add(LanguageData("C",R.drawable.realltr))
        mList.add(LanguageData("C++",R.drawable.realltr))
        mList.add(LanguageData("Python",R.drawable.realltr))
        mList.add(LanguageData("Kotlin",R.drawable.realltr))
        mList.add(LanguageData("Java",R.drawable.realltr))
        mList.add(LanguageData("C",R.drawable.realltr))
        mList.add(LanguageData("C++",R.drawable.realltr))
        mList.add(LanguageData("Python",R.drawable.realltr))

    }
}