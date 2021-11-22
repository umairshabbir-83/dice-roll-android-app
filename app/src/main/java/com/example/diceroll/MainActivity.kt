package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            // Do a dice roll when the app starts
            rollDice()
        }

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        //1st Dice Number Provider
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()

        // Find the TextView in the layout
        val resultTextView1: TextView = findViewById(R.id.textView)
        resultTextView1.text = diceRoll1.toString()

        // Find the ImageView in the layout
        val diceImage1: ImageView = findViewById(R.id.imageView)
        when (diceRoll1) {
            1 -> diceImage1.setImageResource(R.drawable.dice_1)
            2 -> diceImage1.setImageResource(R.drawable.dice_2)
            3 -> diceImage1.setImageResource(R.drawable.dice_3)
            4 -> diceImage1.setImageResource(R.drawable.dice_4)
            5 -> diceImage1.setImageResource(R.drawable.dice_5)
            6 -> diceImage1.setImageResource(R.drawable.dice_6)
        }

        //2nd Dice Number Provider
        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()

        // Find the TextView in the layout
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()

        // Find the ImageView in the layout
        val diceImage2: ImageView = findViewById(R.id.imageView2)
        when (diceRoll2) {
            1 -> diceImage2.setImageResource(R.drawable.dice_1)
            2 -> diceImage2.setImageResource(R.drawable.dice_2)
            3 -> diceImage2.setImageResource(R.drawable.dice_3)
            4 -> diceImage2.setImageResource(R.drawable.dice_4)
            5 -> diceImage2.setImageResource(R.drawable.dice_5)
            6 -> diceImage2.setImageResource(R.drawable.dice_6)
        }
    }

}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}