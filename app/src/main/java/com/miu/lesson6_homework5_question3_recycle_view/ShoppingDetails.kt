package com.miu.lesson6_homework5_question3_recycle_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.shopping_details.*

class ShoppingDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_details)
        val bundle=intent.extras

        // Showing product icon and description page
        ivProductImage.setImageResource(bundle!!.getInt("image"))
        tvName.text = bundle!!.getString("name")
        tvDetails.text = bundle!!.getString("des")

        //List View


    }
}