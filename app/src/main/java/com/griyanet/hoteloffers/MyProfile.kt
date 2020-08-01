package com.griyanet.hoteloffers

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MyProfile : AppCompatActivity() {
    lateinit var myPic: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_me)
        myPic = findViewById(R.id.img_myProfile)
        val picUri = R.drawable.myprofile
        Glide.with(myPic.context)
            .load(picUri)
            .apply(RequestOptions().override(150, 150))
            .into(myPic)
        if (supportActionBar != null) supportActionBar?.title = "My Profile" ?: "My Profile"
    }

}