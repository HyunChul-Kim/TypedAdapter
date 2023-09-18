package com.chul.typedadapter.multiadapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.chul.typedadapter.multiadapter.Item

open class TypedViewHolder(
    val binding: ViewDataBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        if(item.bindingVariableId() > -1) {
            binding.setVariable(item.bindingVariableId(), item)
        }
    }
}