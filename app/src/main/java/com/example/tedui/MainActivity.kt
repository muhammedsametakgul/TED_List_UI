package com.example.tedui

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tedui.adapter.ParentAdapter
import com.example.tedui.databinding.ActivityMainBinding
import com.example.tedui.model.ChildData
import com.example.tedui.model.ParentData
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.LabelVisibilityMode

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    val parentItemList = ArrayList<ParentData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomAppBar3)
        bottomNavigationView.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED


    }


}