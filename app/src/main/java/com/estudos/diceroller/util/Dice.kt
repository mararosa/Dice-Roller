package com.estudos.diceroller.util

import com.estudos.diceroller.R

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

    fun setDiceImage(dice: Int): Int {
        val drawableResource = when (dice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
}