package com.example.lab5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        var radiogroup: RadioGroup = findViewById(R.id.radiogroup)
        var selectedId:Int = radiogroup.checkedRadioButtonId
        var radioButton: RadioButton = findViewById(selectedId)
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("empData",Employee(edit_name.text.toString(),radioButton.text.toString(),text_email.text.toString()
            ,text_saraly.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View){
        edit_name.text.clear()
        radiogroup.clearCheck()
        text_email.text.clear()
        text_saraly.text.clear()
    }
}