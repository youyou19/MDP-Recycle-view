package com.miu.lesson6_homework5_question3_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        // To avoid application crash check intent has data or not
        if (intent.hasExtra("image") && intent.hasExtra("title") && intent.hasExtra("color")) {
            var ig = intent.getIntExtra("image", 0)
            var t1 = intent.getStringExtra("title")
            var t2 = intent.getStringExtra("color")
            var t3 = intent.getStringExtra("id")
            var t4 = intent.getStringExtra("detail")
            name1.text =  t1.toString()
            color1.text = "Color : ${t2.toString()}"
            itemid.text = "Walmat #: ${t3.toString()}"
            detail.text=t4.toString()
            imageView.setImageResource(ig)
        }
    }
}