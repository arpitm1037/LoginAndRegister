package com.example.loginpage

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeScreen : AppCompatActivity() {

    private lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        txt = findViewById(R.id.mytext2)
        val bundle  = intent.extras

        if(bundle!=null){

        val name:String? = bundle.getString("kname")

            val email:String? =bundle.getString("kemail")

            val pass:String? =bundle.getString("kpass")

            txt.text = "Welcome to our Homepage $name with email: $email with password: $pass"
        }
        else{
            Toast.makeText(applicationContext,"No data Recieved",Toast.LENGTH_SHORT).show()
        }





    }
}

