package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    var isDot = false
    var isNumber = false
    var isOperatorLast = false
    var isError = false
    var input : StringBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun digitOnScreen(view: View){
        textView.append((view as Button).text)
        input.append(view.text)
        isNumber = true
        isOperatorLast = false
    }

    fun dotOnScreen(view: View){
        if(isNumber && !isDot && !isOperatorLast){
            textView.append(".")
            input.append(".")
            isDot= true
            isNumber= false
        }
    }

    fun sqrtOnScreen(view: View){
        if(!isDot){
            textView.append("√")
            input.append("sqrt")
        }
    }

    fun clearScreen(view: View){
        textView.text= ""
        input.clear()
        isNumber = false
        isDot = false
        isError = false
    }

    fun addSimpleOperator(view: View){

        if(!isOperatorLast ){
            textView.append((view as Button).text)
            input.append(view.text)
            isNumber = false
            isOperatorLast = true
            isDot = false
        }
    }

    fun addBracket(view: View){
            textView.append((view as Button).text)
            isNumber = false
            isOperatorLast = false
            isDot = false
            input.append(view.text)

    }

    fun onEqual(view : View){
        if (!isError) {

            try {

                var result = ExpressionBuilder(input.toString()).build().evaluate()
                textView.text = result.toString()

            } catch (ex: ArithmeticException) {

                textView.text = "Error"
                isError = true

            }
        }
    }





}