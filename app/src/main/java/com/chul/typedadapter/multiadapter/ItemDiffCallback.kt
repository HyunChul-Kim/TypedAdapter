package com.chul.typedadapter.multiadapter

import androidx.recyclerview.widget.DiffUtil

class ItemDiffCallback: DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.areItemsTheSame(newItem)
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.areContentsTheSame(newItem)
    }
}