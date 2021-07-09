package com.rijaldev.myunsiq

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.rijaldev.myunsiq.databinding.ActivityPesan0Binding


class PesanActivity0 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityPesan0Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPesan0Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Pesan Terkirim", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
    }

}