package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onAC(view: View){
        btnAC.setOnClickListener {
        }
    }

    fun onOperator(view: View){
        btnDivide.setOnClickListener {
        }
        btnMultiply.setOnClickListener {
        }
        btnAdd.setOnClickListener {
        }
        btnSubtract.setOnClickListener {
        }
    }

    fun onDigit(view: View){
        btn0.setOnClickListener {
        }
        btn1.setOnClickListener {
        }
        btn2.setOnClickListener {
        }
        btn3.setOnClickListener {
        }
        btn4.setOnClickListener {
        }
        btn5.setOnClickListener {
        }
        btn6.setOnClickListener {
        }
        btn7.setOnClickListener {
        }
        btn8.setOnClickListener {
        }
        btn9.setOnClickListener {
        }
    }

    fun onDot(view: View){
        btnDot.setOnClickListener {
        }
    }

    fun onEquals(view: View){
        btnEquals.setOnClickListener {
        }
    }

}
