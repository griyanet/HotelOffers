package com.griyanet.hoteloffers


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.hoteloffer_detail.*


class HotelOfferActivity : AppCompatActivity() {

    private lateinit var photoHotel: ImageView
    private lateinit var roomPhoto1: ImageView
    private lateinit var roomPhoto2: ImageView
    private lateinit var roomPhoto3: ImageView
    private lateinit var roomPhoto4: ImageView
    private lateinit var roomPhoto5: ImageView

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_ROOMNAME1 = "extra_roomName1"
        const val EXTRA_ROOMPRICE1 = "extra_roomPrice1"
        const val EXTRA_ROOMDETAIL1 = "extra_roomDetail1"
        const val EXTRA_ROOMNAME2 = "extra_roomName2"
        const val EXTRA_ROOMPRICE2 = "extra_roomPrice2"
        const val EXTRA_ROOMDETAIL2 = "extra_roomDetail2"
        const val EXTRA_ROOMNAME3 = "extra_roomName3"
        const val EXTRA_ROOMPRICE3 = "extra_roomPrice3"
        const val EXTRA_ROOMDETAIL3 = "extra_roomDetail3"
        const val EXTRA_ROOMPHOTO1 = "extra_roomphoto1"
        const val EXTRA_ROOMPHOTO2 = "extra_roomphoto2"
        const val EXTRA_ROOMPHOTO3 = "extra_roomphoto3"
        const val EXTRA_ROOMPHOTO4 = "extra_roomphoto4"
        const val EXTRA_ROOMPHOTO5 = "extra_roomphoto5"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hoteloffer_detail)
        if (supportActionBar != null) supportActionBar?.title = "Hotel Offer Detail" ?: "Hotel Offer Detail"
        showHotelDetail()
    }

    private fun showHotelDetail() {
        val uriPhoto = intent.getIntExtra(EXTRA_PHOTO, Int.MIN_VALUE)
        photoHotel = findViewById(R.id.img_hotel)
        Glide.with(photoHotel.context)
            .load(uriPhoto)
            .apply(RequestOptions().override(150,230))
            .into(photoHotel)
        val uriRoomPhoto1 = intent.getIntExtra(EXTRA_ROOMPHOTO1, Int.MIN_VALUE)
        val uriRoomPhoto2 = intent.getIntExtra(EXTRA_ROOMPHOTO2, Int.MIN_VALUE)
        val uriRoomPhoto3 = intent.getIntExtra(EXTRA_ROOMPHOTO3, Int.MIN_VALUE)
        val uriRoomPhoto4 = intent.getIntExtra(EXTRA_ROOMPHOTO4, Int.MIN_VALUE)
        val uriRoomPhoto5 = intent.getIntExtra(EXTRA_ROOMPHOTO5, Int.MIN_VALUE)
        roomPhoto1 = findViewById(R.id.roomPhoto1)
        roomPhoto2 = findViewById(R.id.roomPhoto2)
        roomPhoto3 = findViewById(R.id.roomPhoto3)
        roomPhoto4 = findViewById(R.id.roomPhoto4)
        roomPhoto5 = findViewById(R.id.roomPhoto5)
        Glide.with(roomPhoto1.context)
            .load(uriRoomPhoto1)
            .apply(RequestOptions().override(200,220))
            .into(roomPhoto1)
        Glide.with(roomPhoto2.context)
            .load(uriRoomPhoto2)
            .apply(RequestOptions().override(200,220))
            .into(roomPhoto2)
        Glide.with(roomPhoto3.context)
            .load(uriRoomPhoto3)
            .apply(RequestOptions().override(200,220))
            .into(roomPhoto3)
        Glide.with(roomPhoto4.context)
            .load(uriRoomPhoto4)
            .apply(RequestOptions().override(200,220))
            .into(roomPhoto4)
        Glide.with(roomPhoto5.context)
            .load(uriRoomPhoto5)
            .apply(RequestOptions().override(200,220))
            .into(roomPhoto5)

        tv_hotelName.text = intent.getStringExtra(EXTRA_NAME)
        tv_hotelPrice.text = intent.getStringExtra(EXTRA_PRICE)
        tv_hotelDetail.text = intent.getStringExtra(EXTRA_DETAIL)
        sr_hotel.rating = intent.getFloatExtra(EXTRA_RATING, Float.MAX_VALUE)
        tv_roomName1.text = intent.getStringExtra(EXTRA_ROOMNAME1)
        tv_roomPrice1.text = intent.getStringExtra(EXTRA_ROOMPRICE2)
        tv_roomDetail1.text = intent.getStringExtra(EXTRA_ROOMDETAIL1)
        tv_roomName2.text = intent.getStringExtra(EXTRA_ROOMNAME2)
        tv_roomPrice2.text = intent.getStringExtra(EXTRA_ROOMPRICE2)
        tv_roomDetail2.text = intent.getStringExtra(EXTRA_ROOMDETAIL2)
        tv_roomName3.text = intent.getStringExtra(EXTRA_ROOMNAME3)
        tv_roomPrice3.text = intent.getStringExtra(EXTRA_ROOMPRICE3)
        tv_roomDetail3.text = intent.getStringExtra(EXTRA_ROOMDETAIL3)
    }
}