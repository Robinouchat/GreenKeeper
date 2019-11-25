package com.example.hello

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.hello.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val prefs = this.getSharedPreferences("session", Context.MODE_PRIVATE)
        if(prefs.getString("session","")!=""){
            setContentView(R.layout.activity_main)
        }else {
            setContentView(R.layout.activity_main)
        }
    }

    fun ToastMe(view: View){
        val myToast = Toast.makeText(this, "Hello Green Keepers !", Toast.LENGTH_SHORT)
        myToast.show() ;
    }

    fun CountMe(view: View){
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        showCountTextView.text = count.toString()
    }

    fun RandomMe(view:View){
        //Recup total
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        // Start the new activity.
        startActivity(randomIntent)
    }

    fun ConnectMe(view:View){
        val connectIntent = Intent(this, LoginActivity::class.java)
        startActivity(connectIntent)
    }

    fun MissionSee(view:View){
        val connectIntent = Intent(this, MissionActivity::class.java)
        startActivity(connectIntent)
    }
}
