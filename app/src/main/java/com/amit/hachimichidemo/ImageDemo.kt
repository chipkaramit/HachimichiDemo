package com.amit.hachimichidemo

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class ImageDemo : AppCompatActivity() {

    var sampleImages = arrayOf(
            "https://firebasestorage.googleapis.com/v0/b/the-salt-app.appspot.com/o/SeatO_fresh_one.jpeg?alt=media&token=ed7b9f58-7f0a-4c47-a11c-dea2e01f2659",
            "https://firebasestorage.googleapis.com/v0/b/the-salt-app.appspot.com/o/SeatO_fresh_two.jpeg?alt=media&token=36769309-e900-4a55-8e24-46d1d7cc7138"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_demo)

        val carouselView = findViewById<CarouselView>(R.id.carouselView)
        carouselView.pageCount = sampleImages.size
        carouselView.setImageListener(imageListener)
    }

    var imageListener: ImageListener = object : ImageListener {
        override fun setImageForPosition(position: Int, imageView: ImageView) {
            Picasso.get().load(sampleImages[position]).into(imageView)
        }
    }
}