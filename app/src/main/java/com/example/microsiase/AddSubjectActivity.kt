package com.example.microsiase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class AddSubjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_subject)
    }

    fun addSubject(view: View){
        val subjectNameView = findViewById<TextInputEditText>(R.id.subject_name)
        var subjectName = subjectNameView.text

        val semesterView = findViewById<TextInputEditText>(R.id.semester_number)
        var semester = semesterView.text

        val dependencyView = findViewById<TextInputEditText>(R.id.dependency_subject)
        var dependency = dependencyView.text

        val descriptionView = findViewById<TextInputEditText>(R.id.subject_description)
        var description = descriptionView.text

        val groupIdView = findViewById<TextInputEditText>(R.id.id_group)
        var groupId = groupIdView.text

        val teacherIdView = findViewById<TextInputEditText>(R.id.id_teacher)
        var teacherId = teacherIdView.text

        val roomNumberView = findViewById<TextInputEditText>(R.id.room)
        var roomNumber = roomNumberView.text

        val maxAmountView = findViewById<TextInputEditText>(R.id.number_max_students)
        var maxAmount = maxAmountView.text

        val startHourView = findViewById<TextInputEditText>(R.id.start_hour)
        var startHour = startHourView.text

        val endHourView = findViewById<TextInputEditText>(R.id.end_hour)
        var endHour = endHourView.text

        val dayView = findViewById<TextInputEditText>(R.id.day)
        var day = dayView.text

        /*val subjectNameView = findViewById<TextInputEditText>(R.id.subject_name)
        var subjectName = subjectNameView.text

        val semesterView = findViewById<TextInputEditText>(R.id.semester_number)
        var semester = semesterView.text

        val dependencyView = findViewById<TextInputEditText>(R.id.dependency_subject)
        var dependency = dependencyView.text

        val descriptionView = findViewById<TextInputEditText>(R.id.subject_description)
        var description = descriptionView.text

        val groupIdView = findViewById<TextInputEditText>(R.id.group_id)
        var groupId = groupIdView.text

        val teacherIdView = findViewById<TextInputEditText>(R.id.id_teacher)
        var teacherId = teacherIdView.text

        val roomNumberView = findViewById<TextInputEditText>(R.id.room)
        var roomNumber = roomNumberView.text

        val maxAmountView = findViewById<TextInputEditText>(R.id.number_max_students)
        var maxAmount = maxAmountView.text

        val startHourView = findViewById<TextInputEditText>(R.id.start_hour)
        var startHour = startHourView.text

        val endHourView = findViewById<TextInputEditText>(R.id.end_hour)
        var endHour = endHourView.text

        val dayView = findViewById<TextInputEditText>(R.id.day)
        var day = dayView.text*/

        //Add subject data to SQLite

        //Use subjectName, semester, dependency, description, groupId, teacherId, roomNumber, maxAmount, startHour, endHour, and day

        Snackbar.make(view, "Materia agregada", Snackbar.LENGTH_LONG).show()
    }
}
