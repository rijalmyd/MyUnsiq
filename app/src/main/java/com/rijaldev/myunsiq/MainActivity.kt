package com.rijaldev.myunsiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisiasi bottom navigasi menu
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView)

        /* memuat fragment atau tampilan yang terdiri dari beranda, pesan, kuliah, bayar,
        dan profil. ketika user masuk dari login activity maka ia akan diarahkan ke menu beranda(Home)
        */
        loadFragment(HomeFragment())
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    //fungsi untuk pemilihan tampilan/fragment ketika user mengklik salah satu
    override fun onNavigationItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.navigation_home -> loadFragment(HomeFragment())
            R.id.navigation_pesan -> loadFragment(PesanFragment())
            R.id.navigation_kuliah -> loadFragment(KuliahFragment())
            R.id.navigation_bayar -> loadFragment(BayarFragment())
            R.id.navigation_profil -> loadFragment(ProfilFragment())
        }
        return true
    }

    //fungsi untuk memuat tampilan
    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        //mengganti tampilan yang lama ke yang baru (baru diklik user)
        transaction.replace(R.id.frame_layout,fragment)
        transaction.commit()
    }
}