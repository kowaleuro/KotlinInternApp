package com.example.kotlininternapp.model

class Converter() {

    private var input:String = "";

    public fun toArray (): Array<Int> {

        val array = input.split(',').toTypedArray()
        val list: MutableList<Int> = ArrayList()
        array.forEach { list.add(it.toInt()) }
        return list.toTypedArray()

    }

    public fun getInpupt(): String {
        return input
    }

    public fun setInput(newInput:String) {
        this.input = newInput;
    }
}