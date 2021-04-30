# Project Name
> CalculatorAndroid

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)


## General info
Simple calculator application. Created to learn the fundamentals of Kotlin and Android Studio.
An additional library is responsible for calculating mathematical equations.
Possible mathematical operations:
- addition 
- substraction
- multiplication
- division
- square root
- sine
- cosine
- tangent
- percent

## Screenshots
Example screenshot of calculator.

<img src=./img/screenshot1.png width="400" >


## Technologies
* Android Studio - version 4.1.2
* Kotlin - version 1.4.21
* Minimum SDK - version API 16: Android 4.1(Jelly Bean)
* Android Virtual Devide - Pixel 4 API 25
* Library for mathematic operations - exp4j - version 0.4.8 

## Setup
To run application and check it out you will need Android Studio environment. If you have already installed Android Studio environment,
the next step is to create Android Virtual Device in Android Virtual Device Manager. 
If environment is ready, then open the project in Android Studio and click "Run 'app'". 

## Code Examples
Example function which is called when 'equal' is pressed.
```Kotlin
fun onEqual(view : View){

        if (!isError) {

            try {

                var result = ExpressionBuilder(input.toString()).build().evaluate()
                textView.text = result.toString()

            } catch (e: Exception) {
                when (e) {
                    is ArithmeticException, is IllegalStateException -> {
                        textView.text = "Error"
                        isError = true
                    }
                }
            }
        }
    }
```

## Features
List of features ready and TODOs for future development
* Printing number and mathematical symbols on the screen.
* Clear UI.
* Implementation the additional library for mathematical operations.
* Adding typed by user mathematical operation to ExpressionBuilder.
* Writing out the result of mathematical operation.



To-do list:
* Writing out the previous mathematical operation that user typed earlier.
* Trying to write mathematical library by myself.

## Status
Project is: _in progress_

## Inspiration
My inspiration to create such an app was a willings to learn how to use Android Studio environment and Koltin language.
It was my first steps so I appreciate your understanding in the matter. 
