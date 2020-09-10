package com.miu.lesson6_homework5_question3_recycle_view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.*
import kotlinx.android.synthetic.main.item_list.view.*
import android.content.Context

import android.widget.ImageView

class MyAdaptor(var context:Context,val productlist: ArrayList<Product>): RecyclerView.Adapter<MyAdaptor.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdaptor.MyViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_list, parent, false)
        return MyViewHolder(v);
    }
    override fun getItemCount(): Int {
        return  productlist.size
    }

    override fun onBindViewHolder(holder: MyAdaptor.MyViewHolder, position: Int) {
        holder.pName?.text = productlist[position].title
        holder.pPrice.text =" Price : ${productlist[position].price.toString()}"
        holder.pColor.text = "Color : ${productlist[position].color}"
        holder.pImage.setImageResource(productlist[position].imageName)


        holder.parent.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            var res = productlist[position].title
            Toast.makeText(context," $res clicked", Toast.LENGTH_LONG).show()
            intent.putExtra("image", productlist[position].imageName)
            intent.putExtra("title", productlist[position].title)
            intent.putExtra("color",productlist[position].color)
            intent.putExtra("id",productlist[position].itemid)
            intent.putExtra("detail",productlist[position].descProduct)
            context.startActivity(intent)
        }
    }

    class MyViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        val pName=itemView.name
        val pPrice=itemView.price
        val pColor =itemView.color
        val pImage =itemView.image
        val parent =itemView.itemlistLayout



    }



}