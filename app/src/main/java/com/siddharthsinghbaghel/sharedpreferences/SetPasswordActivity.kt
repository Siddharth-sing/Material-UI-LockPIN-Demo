package com.siddharthsinghbaghel.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_password)


        createPassWord()

        val edtName: EditText = findViewById(R.id.edtName)
        val txtPass: TextView = findViewById(R.id.txtPass)
        val btnCheck: ImageButton = findViewById(R.id.btnCheck)

        val name: String = edtName.text.toString()
        val password: Int = txtPass.text.toString().toInt()

        val sharedPref = getSharedPreferences("passPref",MODE_PRIVATE)
        val editor = sharedPref.edit()



        btnCheck.setOnClickListener{

            editor.apply {

                putString("name",name)
                putInt("password",password)
                apply()
            }

            Toast.makeText(this, "Pin created go back and login", Toast.LENGTH_LONG).show()

        }



    }

    private fun createPassWord() {
        val btn0:Button = findViewById(R.id.btn0)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)
        val btn4:Button = findViewById(R.id.btn4)
        val btn5:Button = findViewById(R.id.btn5)
        val btn6:Button = findViewById(R.id.btn6)
        val btn7:Button = findViewById(R.id.btn7)
        val btn8:Button = findViewById(R.id.btn8)
        val btn9:Button = findViewById(R.id.btn9)
        val btnErase:ImageButton = findViewById(R.id.btnErase)



    }
}