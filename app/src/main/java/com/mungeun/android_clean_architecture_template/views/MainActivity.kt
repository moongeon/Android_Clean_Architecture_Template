package com.mungeun.android_clean_architecture_template.views

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.mungeun.android_clean_architecture_template.R
import com.mungeun.android_clean_architecture_template.base.BaseActivity
import com.mungeun.android_clean_architecture_template.databinding.ActivityMainBinding

import dagger.hilt.android.AndroidEntryPoint

/***
 * Navigation 연동
 */

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = navHostFragment.navController





    }

}