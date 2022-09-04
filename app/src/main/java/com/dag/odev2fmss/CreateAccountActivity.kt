package com.dag.odev2fmss

import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dag.odev2fmss.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {

    private lateinit var email: String
    private lateinit var username: String
    private lateinit var password: String

    private lateinit var binding: ActivityCreateAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        binding.button.setOnClickListener {
            if (binding.editTextTextPersonName.text.isEmpty()
                || binding.editTextTextPersonName2.text.isEmpty()
                || binding.editTextTextPassword.text.isEmpty()
            )
                Toast.makeText(
                    this,
                    "Please fill e-mail, username and password!",
                    Toast.LENGTH_LONG
                ).show()
            else {
                email = binding.editTextTextPersonName.text.toString()
                username = binding.editTextTextPersonName2.text.toString()
                password = binding.editTextTextPassword.text.toString()

                Toast.makeText(
                    this,
                    "E-Mail: $email\nUsername: $username\nAccount Created!",
                    Toast.LENGTH_LONG
                )
                    .show()
            }
        }
    }
}