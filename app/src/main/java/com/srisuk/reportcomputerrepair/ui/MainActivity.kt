package com.srisuk.reportcomputerrepair.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.srisuk.reportcomputerrepair.HistoryFragment
import com.srisuk.reportcomputerrepair.HomeFragment
import com.srisuk.reportcomputerrepair.R
import com.srisuk.reportcomputerrepair.StatusFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation.setOnNavigationItemSelectedListener(navListener)
         if (savedInstanceState == null)
             replaceFragment(HomeFragment())
    }

     private fun replaceFragment(fragment: Fragment) {
         supportFragmentManager.beginTransaction().replace(
             R.id.fragment_container,
             fragment
         ).commit()
     }
       private val navListener: BottomNavigationView.OnNavigationItemSelectedListener =
           BottomNavigationView.OnNavigationItemSelectedListener { item ->
               val selectedFragment: Fragment = when (item.itemId) {
                   R.id.nav_home -> HomeFragment()
                   R.id.nav_history -> HistoryFragment()
                   else -> StatusFragment()
               }
               replaceFragment(selectedFragment)
               true
           }
}


