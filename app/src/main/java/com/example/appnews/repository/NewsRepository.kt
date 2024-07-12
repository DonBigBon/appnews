package com.example.appnews.repository

import com.example.appnews.api.RetrofitInstance
import com.example.appnews.db.ArticleDatabase
import java.util.Locale.IsoCountryCode

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}