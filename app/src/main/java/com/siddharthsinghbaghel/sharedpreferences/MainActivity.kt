package com.siddharthsinghbaghel.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTypePin: Button = findViewById(R.id.buttonTypePin)
        val buttonSetPin: Button = findViewById(R.id.buttonSetPin)

        buttonSetPin.setOnClickListener{
            val intent = Intent(this,SetPasswordActivity::class.java)
            startActivity(intent)
        }

        buttonTypePin.setOnClickListener{

            val intent = Intent(this,PasswordTypeActivity::class.java)
            startActivity(intent)

        }

    }
}