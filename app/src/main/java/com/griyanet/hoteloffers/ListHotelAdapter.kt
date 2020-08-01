package com.griyanet.hoteloffers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class ListHotelAdapter(private val listHotel: ArrayList<Hotel>) : RecyclerView.Adapter<ListHotelAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback (
        onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvHotelName: TextView = itemView.findViewById(R.id.tv_hotel_name)
        var starRating: RatingBar = itemView.findViewById(R.id.star_rating)
        var hotelPrice: TextView = itemView.findViewById(R.id.tv_hotel_price)
        var hotelPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var hotelDetail: TextView = itemView.findViewById(R.id.tv_hotel_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.hoteloffer_list, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHotel.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hotelOffer  = listHotel[position]
        Glide.with(holder.itemView.context)
            .load(hotelOffer.photo)
            .apply(RequestOptions().override(60,60))
            .into(holder.hotelPhoto)
        holder.tvHotelName.text = hotelOffer.name
        val star = hotelOffer.starRating
        holder.starRating.rating = star
        val hotelPrice = rupiah(hotelOffer.price)
        holder.hotelPrice.text = hotelPrice
        holder.hotelDetail.text = hotelOffer.detail

        holder.itemView.setOnClickListener() {
            onItemClickCallback
                .onItemClick(listHotel[holder.adapterPosition])
        }
    }

    private fun rupiah(number: Int): String {
        val localID = Locale("in", "ID")
        val numberFormat = NumberFormat.getCurrencyInstance(localID)
        return numberFormat.format(number).toString()
    }

    interface OnItemClickCallback {
        fun onItemClick(data: Hotel)
    }
}


