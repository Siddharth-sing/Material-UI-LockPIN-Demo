package com.siddharthsinghbaghel.sharedpreferences

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_password)


        val edtName: EditText = findViewById(R.id.edtName)
        val edtPass: EditText = findViewById(R.id.edtPass)
        val btnSave: Button = findViewById(R.id.btnSave)

        val sharedPref = getSharedPreferences("passPref", MODE_PRIVATE)
        val editor = sharedPref.edit()


        btnSave.setOnClickListener{

            val name: String = edtName.text.toString()
            val password: String = edtPass.text.toString()

            editor.apply {

                putString("name", name)
                putString("password", password)
                apply()
            }

            val passs = sharedPref.getString("name", null)

            Toast.makeText(this, "pass = $passs ", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,PasswordTypeActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}


