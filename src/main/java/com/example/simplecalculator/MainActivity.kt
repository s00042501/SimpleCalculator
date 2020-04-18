package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickAdd(v: View){
        val number_1:Int= et_num1.text.toString().toInt()

        val number_2:Int= et_num2.text.toString().toInt()
        val result_add= number_1 + number_2
        tv_result.text= "Result : " + result_add + " (Sum)"


    }
    fun clickMinus(v: View){
        val number_1:Int= et_num1.text.toString().toInt()

        val number_2:Int= et_num2.text.toString().toInt()
        val result_add= number_1 - number_2
        tv_result.text= "Result : " + result_add + " (Subtract)"



    }
}
