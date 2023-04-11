package com.example.tedui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tedui.databinding.ChildItemBinding
import com.example.tedui.databinding.ParentItemBinding
import com.example.tedui.model.ParentData

class ParentAdapter(var mContext:Context,var liste:List<ParentData>):RecyclerView.Adapter<ParentAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: ParentItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ParentItemBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return liste.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gelen = liste.get(position)
        val t= holder.binding
        t.tvTitle.text=gelen.title
        t.rvChild.setHasFixedSize(true)
        t.rvChild.layoutManager=GridLayoutManager(mContext,1,RecyclerView.HORIZONTAL,false)

        val adapter = ChildAdapter(mContext,gelen.childList)

        t.rvChild.adapter = adapter

    }
}