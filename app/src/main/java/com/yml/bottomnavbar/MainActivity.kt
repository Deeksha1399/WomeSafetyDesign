package com.yml.bottomnavbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavBar)

        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false

        bottomNavigationView.itemIconTintList = null;

    }
}