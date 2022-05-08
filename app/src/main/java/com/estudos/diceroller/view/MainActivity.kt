package com.estudos.diceroller.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.estudos.diceroller.databinding.ActivityMainBinding
import com.estudos.diceroller.util.Dice

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val dice = Dice(6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.button.setOnClickListener {
            setupDiceRollImage()
        }
    }

    private fun setupDiceRollImage() {
        val firstDiceRoll = dice.roll()
        val secondDiceRoll = dice.roll()

        binding.firstDice.setImageResource(dice.setDiceImage(firstDiceRoll))
        binding.secondDice.setImageResource(dice.setDiceImage(secondDiceRoll))
    }
}
