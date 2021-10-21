//package com.siddharthsinghbaghel.sharedpreferences
//import android.content.SharedPreferences
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val btnSave:Button = findViewById(R.id.btnGo)
//        val edtName: EditText = findViewById(R.id.edtTitle)
//        val edtPass: EditText = findViewById(R.id.edtDesc)
//
//        val sharedPref = getSharedPreferences("passPref", MODE_PRIVATE)
//        val editor = sharedPref.edit()
//
//        btnSave.setOnClickListener{
//
//            val name: String = edtName.text.toString()
//            val pass: Int = edtPass.text.toString().toInt()
//
//            editor.apply{
//                putString("name", name)
//                putInt("password", pass)
//                apply()
//            }
//            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
//
//           checkPass(sharedPref)
//
//        }
//    }
//
//    private fun checkPass(sharedPref: SharedPreferences) {
//
//        val name = sharedPref.getString("name",null)
//        val password = sharedPref.getInt("password",1234)
//        Toast.makeText(this, "name = $name \n Password = $password ", Toast.LENGTH_SHORT).show()
//    }
//}