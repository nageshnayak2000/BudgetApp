package com.example.budgetapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.expenses.*
import kotlinx.android.synthetic.main.expenses.view.*
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expenses)

        Totalamntid.setOnClickListener {

            val txt = (foodid.text.toString()).toInt()
            val txt1 = (Medicalid.text.toString()).toInt()
            val txt2 = (Travellingid.text.toString()).toInt()
            val txt3 = (Rentid.text.toString()).toInt()
            val txt4 = (Miscellaneousid.text.toString()).toInt()

            val result = txt + txt1 + txt2 + txt3 + txt4
            val result2 = result.absoluteValue
            resultid.text = result2.toString()
        }
    }
}



