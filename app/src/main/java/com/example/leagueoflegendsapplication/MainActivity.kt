package com.example.leagueoflegendsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.leagueoflegendsapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val btn = findViewById<Button>(R.id.help);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        binding.btn1.setOnClickListener() {
            replaceFragment(Champions())
        }

        binding.btn2.setOnClickListener() {
            replaceFragment(Spells())

        }

        btn.setOnClickListener(){
            replaceFragment(Description())
        }


    }

    private fun replaceFragment(fragment : Fragment) {
    val fragmentManager = supportFragmentManager
    val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.ChampionsF,fragment)
        fragmentTransaction.commit()
    }
}