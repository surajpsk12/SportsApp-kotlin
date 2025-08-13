package com.surajvanshsv.sportsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SportAdapter(val sportslist : ArrayList<SportModel>) :
    RecyclerView.Adapter<SportAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout,parent , false )
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
            holder.sportsimage.setImageResource(sportslist[position].sportImage)
            holder.sportsname.text = sportslist[position].sportName

    }

    override fun getItemCount(): Int {
        return sportslist.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        // catch refernces of view type
        var sportsimage : ImageView
        var sportsname : TextView

        init {
            sportsname = itemView.findViewById<TextView>(R.id.textView)
            sportsimage = itemView.findViewById<ImageView>(R.id.imageView)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context,
                    "You clicked ${sportslist[adapterPosition].sportName}",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }
}