package com.example.randomnumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.generateButton)

        btn.setOnClickListener {
            rand()
        }
    }

    private fun rand(){

        val textView:TextView = findViewById(R.id.textArea)

        Toast.makeText(this,"Random Number Generated", Toast.LENGTH_LONG).show()
        var numb = (1..10).random()
        textView.text = numb.toString()
    }
}