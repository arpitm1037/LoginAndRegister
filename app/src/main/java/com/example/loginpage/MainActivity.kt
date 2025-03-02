package com.example.loginpage

import com.google.android.material.textfield.TextInputEditText
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var edt1: TextInputEditText
    private lateinit var edt2: TextInputEditText
    private lateinit var edt3: TextInputEditText
    private lateinit var buttonlogin: Button
    private lateinit var buttonreg: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        edt1 = findViewById(R.id.myedtlog1)
        edt2 = findViewById(R.id.myedtlog2)
        edt3 = findViewById(R.id.myedtlog3)
        buttonlogin = findViewById(R.id.mybtn)
        buttonreg = findViewById(R.id.mybtn1)



        buttonlogin.setOnClickListener {

            val email: String = edt1.text.toString().trim()
            val name: String = edt2.text.toString().trim()
            val pass: String = edt3.text.toString().trim()




            if (name.isEmpty()) {
                edt1.error = "Name is required"
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                edt2.error = "Email ID is required"
                return@setOnClickListener
            }


            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                edt2.error = "Invalid email format"
                return@setOnClickListener
            }

            if (pass.isEmpty()) {
                edt3.error = "Password is required"
                return@setOnClickListener
            }



            val intent = Intent(this@MainActivity, HomeScreen::class.java)

            val bundle = Bundle()

            bundle.putString("kname", name)
            bundle.putString("kemail", email)
            bundle.putString("kpass", pass)
            intent.putExtras(bundle)


          intent.putExtras(bundle)
            startActivity(intent)

        }

            buttonreg.setOnClickListener {

//                val email: String = edt1.text.toString().trim();
//                val name: String = edt2.text.toString().trim()
//                val pass: String = edt3.text.toString().trim()



                val intent1 = Intent(this@MainActivity, RegisterScreen::class.java)

//                val bundle = Bundle()
//
//                bundle.putString("kname",name)
//                bundle.putString("kemail",email)
//                bundle.putString("kpass",pass)
//                intent.putExtras(bundle)


//            intent.putExtra("kname", name)
                startActivity(intent1)



        }
    }
}