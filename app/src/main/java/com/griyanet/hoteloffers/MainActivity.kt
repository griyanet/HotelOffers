package com.griyanet.hoteloffers

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.hoteloffer_list.view.*
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvHotelOffer : RecyclerView
    private var list: ArrayList<Hotel> = arrayListOf()
    private lateinit var listHotelAdapter: ListHotelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navCotroller = this.findNavController(R.id.my_nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navCotroller)
        rvHotelOffer = findViewById(R.id.rv_hoteloffers)
        showRecyclerList()
        setListClickAction()
    }

    private fun setListClickAction() {
        listHotelAdapter.setOnItemClickCallback(
            object : ListHotelAdapter.OnItemClickCallback {
                override fun onItemClick(data: Hotel) {
                    //Toast.makeText(this@MainActivity, "Kami memilih ${data.name}", Toast.LENGTH_SHORT).show()
                    val manageDetailIntent = Intent(this@MainActivity,
                    HotelOfferActivity::class.java).apply {
                        putExtra(HotelOfferActivity.EXTRA_NAME, data.name)
                        putExtra(HotelOfferActivity.EXTRA_PRICE, rupiah(data.price))
                        putExtra(HotelOfferActivity.EXTRA_DETAIL, data.detail)
                        putExtra(HotelOfferActivity.EXTRA_ROOMNAME1, data.roomName1)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPRICE1, rupiah(data.roomPrice1))
                        putExtra(HotelOfferActivity.EXTRA_ROOMDETAIL1, data.roomDetail1)
                        putExtra(HotelOfferActivity.EXTRA_ROOMNAME2, data.roomName2)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPRICE2, rupiah(data.roomPrice2))
                        putExtra(HotelOfferActivity.EXTRA_ROOMDETAIL2, data.roomDetail2)
                        putExtra(HotelOfferActivity.EXTRA_ROOMNAME3, data.roomName3)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPRICE3, rupiah(data.roomPrice3))
                        putExtra(HotelOfferActivity.EXTRA_ROOMDETAIL3, data.roomDetail3)
                        putExtra(HotelOfferActivity.EXTRA_PHOTO, data.photo)
                        putExtra(HotelOfferActivity.EXTRA_RATING, data.starRating)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPHOTO1, data.roomPhoto1)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPHOTO2, data.roomPhoto2)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPHOTO3, data.roomPhoto3)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPHOTO4, data.roomPhoto4)
                        putExtra(HotelOfferActivity.EXTRA_ROOMPHOTO5, data.roomPhoto5)
                    }
                    startActivity(manageDetailIntent)
                }
            }
        )
    }

    private fun showRecyclerList() {
        /*rvHotelOffer.layoutManager = LinearLayoutManager(this)
        val listHotelAdapter = ListHotelAdapter(list)
        rvHotelOffer.adapter = listHotelAdapter*/
        list.addAll(HotelData.listDataHotel)
        listHotelAdapter = ListHotelAdapter(list)
        rvHotelOffer.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listHotelAdapter
            setHasFixedSize(true)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                var intent = Intent(this, MyProfile::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun rupiah(number: Int): String {
        val localID = Locale("in", "ID")
        val numberFormat = NumberFormat.getCurrencyInstance(localID)
        return numberFormat.format(number).toString()
    }
}