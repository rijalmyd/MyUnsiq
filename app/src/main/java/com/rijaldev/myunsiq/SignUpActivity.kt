package com.rijaldev.myunsiq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val tmblSignUp: FloatingActionButton = findViewById(R.id.tmbl_signup)
        tmblSignUp.setOnClickListener(this)

        val tmblKeLoginActivity : TextView = findViewById(R.id.tmbl_keLogin)
        tmblKeLoginActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tmbl_signup -> {
                val pindahKeMainActivity = Intent(this@SignUpActivity, AktivasiActivity::class.java)
                //memulai activity
                startActivity(pindahKeMainActivity)
            }
            R.id.tmbl_keLogin -> {
                val pindahKeLoginActivity = Intent(this@SignUpActivity,LoginActivity::class.java)
                startActivity(pindahKeLoginActivity)
            }
        }
    }
}