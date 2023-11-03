package com.dog.app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dog.app.R
import com.dog.app.model.Dog

class DogAdapter(private var dogs: MutableList<Dog>) :
    RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_dog, parent, false)
        return DogViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dogs.size
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val template = "Age : %s \t Hobby : %s"
        holder.dogName.text = dogs[position].dogName
        holder.dogDetail.text =
            String.format(template, dogs[position].dogAge, dogs[position].dogHobby)
        holder.dogImage.setImageResource(dogs[position].drawResDog)
    }


    class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val dogImage: ImageView = itemView.findViewById(R.id.dog_image)
        val dogName: TextView = itemView.findViewById(R.id.dog_name)
        val dogDetail: TextView = itemView.findViewById(R.id.dog_detail)

    }


}