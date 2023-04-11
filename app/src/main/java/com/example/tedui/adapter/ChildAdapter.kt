package com.example.tedui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tedui.databinding.ChildItemBinding
import com.example.tedui.model.ChildData

class ChildAdapter(var mContext:Context,var list:List<ChildData>):RecyclerView.Adapter<ChildAdapter.ViewHolder>() {
    inner class ViewHolder(var binding: ChildItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ChildItemBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gelen = list.get(position)
        val t= holder.binding

        t.textView.text=gelen.desc
        t.imageView.setImageResource(mContext.resources.getIdentifier(gelen.image,"drawable",mContext.packageName))


    }
}