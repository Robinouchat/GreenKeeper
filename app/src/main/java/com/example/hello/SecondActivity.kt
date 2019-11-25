package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        ShowRandomNumber()
    }

    fun ShowRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT,0)
        val random = Random()
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }
        findViewById<TextView>(R.id.textView_random).text = randomInt.toString()
        // Substitute the max value into the string resource
        // for the heading, and update the heading
        findViewById<TextView>(R.id.textTitleSecondActivity).text = getString(R.string.random_heading,count)
    }
}
