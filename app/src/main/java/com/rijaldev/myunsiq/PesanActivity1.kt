package com.rijaldev.myunsiq

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.rijaldev.myunsiq.databinding.ActivityPesan1Binding


class PesanActivity1 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityPesan1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPesan1Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.fab1.setOnClickListener { view ->
            Snackbar.make(view, "Pesan Terkirim", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
    }

}