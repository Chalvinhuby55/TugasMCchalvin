package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {
    private lateinit var wisataRecyclerView: RecyclerView
    private lateinit var wisataArrayList: ArrayList<DataWisata>
    private lateinit var wisataAdapter: wisataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        wisataRecyclerView = findViewById(R.id.tampil)
        wisataArrayList = ArrayList()


        wisataArrayList.add(DataWisata(R.drawable.raja, "Raja Ampat", "Tempat destinasi wisata laut"))
        wisataArrayList.add(DataWisata(R.drawable.img, "Kali Biru", "Tempat destinasi wisata laut"))
        wisataArrayList.add(DataWisata(R.drawable.img_1, "Pantai Base G", "Tempat destinasi wisata laut"))
        wisataArrayList.add(DataWisata(R.drawable.img_2, "Danau Love", "Tempat destinasi wisata laut"))
        wisataArrayList.add(DataWisata(R.drawable.img_3, "Jembatan Merah", "Tempat destinasi wisata laut"))
        wisataArrayList.add(DataWisata(R.drawable.img_4, "Pantai Hol-2", "Tempat destinasi wisata laut"))



        wisataRecyclerView.layoutManager = LinearLayoutManager(this)
        wisataRecyclerView.setHasFixedSize(true)
        wisataAdapter = wisataAdapter(wisataArrayList)
        wisataRecyclerView.adapter = wisataAdapter

    }
}