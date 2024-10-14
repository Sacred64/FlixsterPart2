package com.example.flixsterpart1

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object GlideUtils {
    fun loadImage(context: Context, url: String, imageView: ImageView) {
        Glide.with(context)
            .load(url)
            .into(imageView)
    }
}