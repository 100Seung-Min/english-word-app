package com.example.english_app.ui.component.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.english_app.R
import com.example.english_app.databinding.ActivityMainBinding
import com.example.english_app.ui.base.BaseActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity: BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBottomNav()
    }

    private fun initBottomNav(){
        val navController =
            supportFragmentManager.findFragmentById(R.id.fragment_view)?.findNavController()
        val nav = binding.bottomNavigation as BottomNavigationView
        navController?.let {
            nav.setupWithNavController(navController)
        }
    }

    override fun initView() {
    }

    override fun observeEvent() {
    }
}