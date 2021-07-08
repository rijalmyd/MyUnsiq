package com.rijaldev.myunsiq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //inisiasi tombol pada layout
        val tmblLogin : FloatingActionButton = findViewById(R.id.tmbl_login)
        //set sebagai listener tombol
        tmblLogin.setOnClickListener(this)
    }

    //fungsi ketika tombol diklik
    override fun onClick(v: View?) {
        //ketika tombol login di klik, maka user akan diarahkan dari login activity ke main activity
        when(v?.id){
            R.id.tmbl_login -> {
                val pindahKeMainActivity = Intent(this@LoginActivity, MainActivity::class.java)
                //memulai activity
                startActivity(pindahKeMainActivity)
            }
        }
    }
}