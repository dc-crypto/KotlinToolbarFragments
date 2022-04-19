package com.diegocastro.kotlintoolbarfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.diegocastro.kotlintoolbarfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //1.
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //2
        binding= ActivityMainBinding.inflate(layoutInflater)

        //.3
        setContentView(binding.root)

        //4. aqui le

        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }


}