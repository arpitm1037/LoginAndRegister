package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterScreen : AppCompatActivity() {

    private lateinit var txt1: TextView

    private lateinit var edit1: EditText
    private lateinit var edit2: EditText
    private lateinit var edit3: EditText
    private lateinit var edit4: EditText
    private lateinit var edit5:EditText
    private lateinit var button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register_screen)



        edit1 = findViewById(R.id.myeditlog1)
        edit2 = findViewById(R.id.myeditlog2)
        edit3 = findViewById(R.id.myeditlog3)
        edit4 = findViewById(R.id.myeditlog4)
        edit5 = findViewById(R.id.myeditlog5)
        button = findViewById(R.id.mybtn2)



        button.setOnClickListener {


            val email: String = edit1.text.toString().trim()
            val name: String = edit2.text.toString().trim()
            val pass: String = edit3.text.toString().trim()
            val phone: String = edit4.text.toString().trim()
            val cpass:String=edit5.text.toString().trim()



            if (name.isEmpty()) {
                edit1.error = "Name is required"
                return@setOnClickListener
            }

            if (phone.isEmpty()) {
                edit2.error = "Phone number is required"
                return@setOnClickListener
            }


            if (!android.util.Patterns.PHONE.matcher(phone).matches() || phone.length < 10) {
                edit2.error = "Invalid phone number"
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                edit3.error = "Email ID is required"
                return@setOnClickListener
            }


            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                edit3.error = "Invalid email format"
                return@setOnClickListener
            }

            if (pass.isEmpty()) {
                edit4.error = "Password is required"
                return@setOnClickListener
            }


            if (pass.length < 6) {
                edit4.error = "Password must be at least 6 characters"
                return@setOnClickListener
            }

            if (cpass.isEmpty()) {
                edit5.error = "Confirm Password is required"
                return@setOnClickListener
            }


            if (pass != cpass) {
                edit5.error = "Passwords do not match"
                return@setOnClickListener
            }





            val intent = Intent(this@RegisterScreen, HomeScreen::class.java)
            intent.putExtra("kname",name)
            startActivity(intent)


            txt1 = findViewById(R.id.myreg1)
//            val int = intent.extras


        }

    }
}