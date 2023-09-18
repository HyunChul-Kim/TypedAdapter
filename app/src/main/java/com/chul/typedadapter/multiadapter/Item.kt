package com.chul.typedadapter.multiadapter

interface Item {
    fun layoutId(): Int
    fun bindingVariableId(): Int
    fun areItemsTheSame(newItem: Item): Boolean
    fun areContentsTheSame(newItem: Item): Boolean
}