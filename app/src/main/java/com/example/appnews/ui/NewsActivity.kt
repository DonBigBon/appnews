package com.example.appnews.ui

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.appnews.R
import com.example.appnews.databinding.ActivityMainBinding
import com.example.appnews.db.ArticleDatabase
import com.example.appnews.repository.NewsRepository

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val newsNavHostFragment: View = findViewById(R.id.newsNavHostFragment)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}
