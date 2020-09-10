package com.miu.lesson6_homework5_question3_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Give the recycler view with Linear layout manager.
        recycleId?.layoutManager =  LinearLayoutManager(this)
        // Populate Product  data list
        var itemDetail=resources.getStringArray(R.array.detail)
        val products = ArrayList<Product>()
        products.add(Product("RGA Voyager 7 16GB Android Tablet",35.00,"Black",R.drawable.voyager,"34522",itemDetail[0]))
        products.add(Product("HP Flyer Red 15.6 Laptop",299.0,"Black & Red ",R.drawable.flyer,"66689", itemDetail[1]))
        products.add(Product("VIZZTO 70 Class 4K",1298.0,"Black",R.drawable.vizio,"45632", itemDetail[2]))
        products.add(Product("Epson WorkForce WF-2750",69.00,"Black",R.drawable.epson,"76534", itemDetail[3]))
        products.add(Product("Epson WorkForce WF-2750",555.00,"Black & Black",R.drawable.headphones,"76534", itemDetail[4]))



        // Create an adapter and supply the data to be displayed.
        var adapter = MyAdaptor(this,products)
        // Connect the adapter with the recycler view.
        recycleId.adapter = adapter
    }
}