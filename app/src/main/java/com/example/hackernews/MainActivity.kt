package com.example.hackernews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import retrofit2.Retrofit
import java.io.IOException


class MainActivity : AppCompatActivity() {
    val checklist: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addelemts()
        fetchjson()
        news_recyclerview.layoutManager=LinearLayoutManager(this)
        news_recyclerview.adapter=NewsAdapter(checklist,this)

    }
    fun fetchjson(){
        val url="https://hacker-news.firebaseio.com/"
        val requests=Request.Builder().url(url).build()
        val client=OkHttpClient()
        val retrofit=Retrofit.Builder().baseUrl(url).build()
        client.newCall(requests).enqueue(object :Callback{
            override fun onFailure(call: Call, e: IOException) {
            Log.d("MainActivity","Actvity failed")
            }

            override fun onResponse(call: Call, response: Response) {
                val result= response.body?.string()
                Log.d("MainActivity","Success $retrofit\n $result")
            }

        })
    }
fun addelemts(){
    checklist.add("Prateek")
    checklist.add("Prateek1")
    checklist.add("Prateek2")
    checklist.add("Prateek3")
    checklist.add("Prateek4")
    checklist.add("Prateek5")
}
}
