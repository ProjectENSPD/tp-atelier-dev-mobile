package com.example.diceroller

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
       rollButton.setOnClickListener {
           //Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

           val resultTextView:TextView=findViewById(R.id.textView)
          resultTextView.text="6"

        }


    }
}
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}