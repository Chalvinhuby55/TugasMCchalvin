package com.example.loginapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class wisataAdapter (private val wisataList: ArrayList<DataWisata>): RecyclerView.Adapter<wisataAdapter.MyViewHolder>() {

    class MyViewHolder(itemData: View) : RecyclerView.ViewHolder (itemData){

        val gambar : ImageView =itemData.findViewById(R.id.img)
        val tempat : TextView = itemData.findViewById(R.id.tmpt)
        val deskripsi : TextView = itemData.findViewById(R.id.ulasan)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemWisata = LayoutInflater.from(parent.context).inflate(R.layout.data_data,parent, false)
        return MyViewHolder(itemWisata)
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem: DataWisata = wisataList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.tempat.text = currentItem.judul
        holder.deskripsi.text = currentItem.Deskripsi
    }
}