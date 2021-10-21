package com.siddharthsinghbaghel.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SetPinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_pin)

        val buttonPin: Button = findViewById(R.id.buttonSetPin)

        buttonPin.setOnClickListener{

            val intent = Intent(this,PasswordActivity::class.java)
            startActivity(intent)

        }

    }
}