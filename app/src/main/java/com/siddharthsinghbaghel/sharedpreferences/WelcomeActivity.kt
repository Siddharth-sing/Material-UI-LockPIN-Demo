package com.siddharthsinghbaghel.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {

    override fun onRestart() {
        super.onRestart()
        val intent = Intent(this,PasswordTypeActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
}