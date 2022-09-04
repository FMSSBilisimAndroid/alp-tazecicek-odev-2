package com.dag.odev2fmss

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dag.odev2fmss.databinding.ActivityWelcomeBackBinding


class WelcomeBackActivity : AppCompatActivity() {

    private val username = "Alp Tazecicek"
    private val password = "1234"

    private lateinit var binding: ActivityWelcomeBackBinding
    private lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        binding = ActivityWelcomeBackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myIntent = Intent(this, CreateAccountActivity::class.java)

        binding.textView6.setOnClickListener {
            startActivity(myIntent)
        }
    }

    override fun onResume() {
        super.onResume()

        binding.button.setOnClickListener {
            if (username == binding.editTextTextPersonName.text.toString()
                && password == binding.editTextTextPassword.text.toString()
            ) {
                Toast.makeText(this, "Logged In", Toast.LENGTH_LONG).show()
            } else if (binding.editTextTextPersonName.text.isEmpty() || binding.editTextTextPassword.text.isEmpty()) {
                Toast.makeText(this, "Username or Password can't leave empty.", Toast.LENGTH_LONG)
                    .show()
            } else Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_LONG).show()
        }
    }
}