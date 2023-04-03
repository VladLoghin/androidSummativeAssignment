package com.example.summativeassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var counterButton=findViewById<Button>(R.id.counterPage)
        counterButton.setOnClickListener{
            setContentView(R.layout.activity_counter)
        }
        var miniCalcButton=findViewById<Button>(R.id.miniCalculator)
        miniCalcButton.setOnClickListener{
            setContentView(R.layout.mini_calc_layout)
        }
        var tipCalcButton=findViewById<Button>(R.id.TipCalculator)
        tipCalcButton.setOnClickListener{
            setContentView(R.layout.tip_calc_layout)
        }
        var aboutButton=findViewById<Button>(R.id.aboutPage)
        aboutButton.setOnClickListener {
            setContentView(R.layout.about_layout)
        }

    }

    fun onCounterLoad(v: View){
        setContentView(R.layout.activity_counter)

        var counter = 0

        var counterText: TextView = findViewById(R.id.textView)

        counterText.text= counter.toString()


        var counterAdd: Button = findViewById(R.id.add)
        counterAdd.setOnClickListener {
            counter += 1
            counterText.text = counter.toString()
            Log.i("counter", "counter: $counter")
        }

        var counterSub: Button = findViewById(R.id.substract)
        counterSub.setOnClickListener {
            counter -= 1
            counterText.text = counter.toString()
            Log.i("counter", "counter: $counter")
        }


    }




}