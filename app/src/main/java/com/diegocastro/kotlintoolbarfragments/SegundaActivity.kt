package com.diegocastro.kotlintoolbarfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegocastro.kotlintoolbarfragments.databinding.ActivityMainBinding
import com.diegocastro.kotlintoolbarfragments.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding= ActivitySegundaBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}