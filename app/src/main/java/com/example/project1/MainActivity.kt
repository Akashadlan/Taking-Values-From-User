package com.example.project1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etname : EditText
    lateinit var etemail : EditText
    lateinit var etcontect : EditText
    lateinit var etcollage : EditText
    lateinit var rb1 : RadioButton
    lateinit var rb2 : RadioButton
    lateinit var etstudy : EditText
    lateinit var btnplay : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etname = findViewById(R.id.etName)
        etemail = findViewById(R.id.etemail)
        etcontect = findViewById(R.id.etcontect)
        etcollage = findViewById(R.id.etcollage)
        rb1 = findViewById(R.id.rb1)
        rb2 = findViewById(R.id.rb2)
        etstudy = findViewById(R.id.etstudy)
        btnplay = findViewById(R.id.btnplay)

        btnplay?.setOnClickListener {
            Toast.makeText(this, "Success Your Id", Toast.LENGTH_SHORT).show()

          if(etname.text.toString().trim().isNullOrEmpty()){
                etname.error = "enter your name"

            }else if(etemail.text.toString().trim().isNullOrEmpty()){
                etemail.error = "enter your name"

            }else if(etcollage.text.toString().trim().isNullOrEmpty()){
            etcollage.error = "enter your name"
            }else if (etcontect.text.toString().isNullOrEmpty()){
                etcontect.error = "enter your number"

            }else if (etcontect.text.toString().toString().length<10){
                etcontect.error = "number is not valid"

            }else if(etstudy.text.toString().trim().isNullOrEmpty()){
                etstudy.error = "enter your study"
            }
            var intent = Intent(this, Nextr_page::class.java)
            startActivity(intent)
        }
        rb1?.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                etstudy?.visibility = View.VISIBLE
            }else{
                etstudy?.visibility = View.GONE
            }
        }


    }
}