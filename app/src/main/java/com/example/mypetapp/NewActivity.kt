package com.example.mypetapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.os.HandlerCompat.postDelayed
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class NewActivity {

    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById<Any>(R.id.btnGetStarted)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Declaring variables
        val imgV = findViewById<Button>(R.id.MainImageView)
        val FeedButton = findViewById<Button>(R.id.myHunger)
        val CleanButton = findViewById<Button>(R.id.myClean)
        val PlayButton = findViewById<Button>(R.id.myPlay)
        val HungerTextView = findViewById<TextView>(R.id.HngTextView)
        val CleanTextView = findViewById<TextView>(R.id.ClnTextView)
        val HappyTextView = findViewById<TextView>(R.id.plyTextView)
        val message = findViewById<TextView>(R.id.messageTextView)
        var currentHintValue1 = 2
        var currentHintValue2 = 2
        var currentHintValue3 = 2

        //  clicking feed button to change the picture according to the action
        FeedButton.setOnClickListener {
            // Selecting picture from the list
            imgV.setImageResource(imgList[0])
            val imgIdx = null
            imgIdx++
            Handler().postDelayed({ imgV.setImageResource(R.drawable.mydog) }, 3672)
            // Updating hunger
            if (currentHintValue1 < 10) {
                currentHintValue1++
                HungerTextView.text = currentHintValue1.toString()
            }
            message.text = " Keep clicking "
            if (currentHintValue1 == 10) {
                message.text = "Yum :)"
            }
        }
        CleanButton.setOnClickListener {
            imgV.setImageResource(imgList[1])
            imgIdx++
            Handler().({ imgV.setImageResource(R.drawable.mydog2) }, 3672)
            if (currentHintValue2 < 10) {
                currentHintValue2++
            }
        }
        PlayButton.setOnClickListener {
            imgV.setImageResource(imgList[2])
            val imgIdx = null
            imgIdx++
            Handler().({ imgV.setImageResource(R.drawable.mydog3) }, 3672)
            // Setting a limit
            if (currentHintValue3 < 10) {
                currentHintValue3++

                // Message Display for max status
                if (currentHintValue3 == 10) {

                }
            }

        }
    }

    class Handler {


    }

    private fun Any.setImageResource(mydog: Any) {
        TODO("Not yet implemented")
    }

    private fun Any.setOnClickListener(function: () -> Unit) {
        TODO("Not yet implemented")
    }

    private fun setContentView(activityNew: Int) {
        TODO("Not yet implemented")
    }

    private fun <T> findViewById(mainImageView: Int): Any {
        TODO("Not yet implemented")
    }
}













