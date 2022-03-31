package com.example.roulettewheel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 ** This activity allows the user to turn a roulette wheel and view the result
 ** on the screen.
 **/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { turnWheel() }
    }

    /**
     ** Turn the roulette wheel and update the screen with the result.
     **/
    private fun turnWheel() {
        // Create new RouletteWheel object
        val rouletteWheel = RouletteWheel()

        // Update the screen with the wheel number after turning wheel
        val resultTextView: TextView = findViewById(R.id.textView1)
        resultTextView.text = rouletteWheel.turnWheel().toString()
    }
}

class RouletteWheel {
    fun turnWheel(): Int {
        return (1..36).random()
    }
}