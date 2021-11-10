package com.example.portofolio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.portofolio.R
import com.example.portofolio.data.Portofolio

class RVExperienceAdapter : RecyclerView.Adapter<RVExperienceAdapter.ExperienceViewHolder>() {

    private val listData = ArrayList<Portofolio>()

    var onItemClicked: ((Portofolio) -> Unit)? = null

    fun setData(data: List<Portofolio>?) {
        if (data == null) return
        listData.clear()
        listData.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceViewHolder =
        ExperienceViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_experience, parent, false)
        )

}