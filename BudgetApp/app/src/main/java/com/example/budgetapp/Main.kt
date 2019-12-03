package com.example.budgetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import layout.Income
import com.example.budgetapp.R.layout.mainpg
import kotlinx.android.synthetic.main.mainpg.*

class Main1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainpg)


        income.setOnClickListener {


            val intentgotoActivity2 = Intent(this, mainpg::class.java)
            startActivity(intentgotoActivity2)
        }
    }
}
