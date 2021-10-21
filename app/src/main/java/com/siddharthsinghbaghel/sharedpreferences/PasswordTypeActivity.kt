package com.siddharthsinghbaghel.sharedpreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class PasswordTypeActivity : AppCompatActivity(), View.OnClickListener {

    private var codeString: String = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_type)


        val btn0: Button = findViewById(R.id.btn0)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)
        val btn4:Button = findViewById(R.id.btn4)
        val btn5:Button = findViewById(R.id.btn5)
        val btn6:Button = findViewById(R.id.btn6)
        val btn7:Button = findViewById(R.id.btn7)
        val btn8:Button = findViewById(R.id.btn8)
        val btn9:Button = findViewById(R.id.btn9)
        val btnErase: ImageButton = findViewById(R.id.btnErase)
        val btnCheck: ImageButton = findViewById(R.id.btnCheck)


        btn0.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnErase.setOnClickListener(this)


        btnCheck.setOnClickListener{

            Toast.makeText(this, "codeString = $codeString", Toast.LENGTH_LONG).show()
        }


    }

    override fun onClick(v: View?) {

        when (v!!.id) {
            R.id.btn0 -> codeString += "0"
            R.id.btn1 -> codeString += "1"
            R.id.btn2 -> codeString += "2"
            R.id.btn3 -> codeString += "3"
            R.id.btn4 -> codeString += "4"
            R.id.btn5 -> codeString += "5"
            R.id.btn6 -> codeString += "6"
            R.id.btn7 -> codeString += "7"
            R.id.btn8 -> codeString += "8"
            R.id.btn9 -> codeString += "9"
            else -> {
            }
        }
    }
}