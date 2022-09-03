package com.dag.odev2fmss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.dag.odev2fmss.databinding.ActivityLetsGetStartedBinding
import com.dag.odev2fmss.databinding.ActivityWelcomeBackBinding

class WelcomeBackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.TYPE_STATUS_BAR,
            WindowManager.LayoutParams.TYPE_STATUS_BAR
        )
        //window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        binding = ActivityWelcomeBackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding = DataBindingUtil.setContentView(this,R.layout.activity_welcome_back)

    }
}