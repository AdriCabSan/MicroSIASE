package com.example.microsiase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class AddStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)
    }

    fun addStudent(view: View){
        val idView = findViewById<TextInputEditText>(R.id.student_name)
        var name = idView.text

        val semesterView = findViewById<TextInputEditText>(R.id.semester_number)
        var semester = semesterView.text

        val groupView = findViewById<TextInputEditText>(R.id.group_id)
        var group = groupView.text

        val gradeView = findViewById<TextInputEditText>(R.id.grade)
        var grade = gradeView.text

        val opportunityView = findViewById<TextInputEditText>(R.id.opportunity)
        var opportunity = opportunityView.text
        //var student=SystemStudent(id,semester,group,grade,opportunity)
        //Add student data to SQLite

        //Use id, semester, group, grade, and opportunity


        Snackbar.make(view, "Estudiante agregado", Snackbar.LENGTH_LONG).show()
    }

}
