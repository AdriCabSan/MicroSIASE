package com.example.microsiase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton

class StudentListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val fab: View = findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener {
            val intent = Intent(this, AddStudentActivity::class.java)
            startActivity(intent)
        }
    }
}
