//package com.example.hackernews
//
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class RetroFitclient {
//    lateinit var retrofit:Retrofit
//    val url="https://hacker-news.firebaseio.com/v0/item/8863.json?print=pretty"
//    fun getRetrofit(){
//        retrofit=Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create())
//            .build()
//    return retrofit
//    }
//
//}