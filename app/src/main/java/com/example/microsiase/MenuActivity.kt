package com.example.microsiase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun studentsList(view: View){
        val intent = Intent(this, StudentListActivity::class.java)
        startActivity(intent)
    }

    fun subjectsList(view: View){
        val intent = Intent(this, SubjectsListActivity::class.java)
        startActivity(intent)
    }
}
