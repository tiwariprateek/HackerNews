package com.example.hackernews

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.news_row.view.*

class NewsAdapter(val checklist: ArrayList<String>, val context: Context):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.news_row, parent, false))
    }

    override fun getItemCount(): Int {
    return checklist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.setText(checklist.get(position))
//        holder.title.setOnClickListener {
//            val url=checklist.get(position).Url
//            val webview=WebView(context)
//            webview.loadUrl(url)
//            val alert=AlertDialog.Builder(context)
//            webview.webViewClient(object :WebViewClient(){
//
//            })
//        }
    }
}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val title=view.news_text
}