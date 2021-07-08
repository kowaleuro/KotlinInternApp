package com.example.kotlininternapp.model

class Converter() {

    private var input:String = "";

    public fun toArray (): Array<Int> {
        val regex = Regex(pattern ="[0-9]+(,[0-9]+)+" )
        if (regex.matches(input)) {
            val array = input.split(',').toTypedArray()
            val list: MutableList<Int> = ArrayList()
            array.forEach { list.add(it.toInt()) }
            return list.toTypedArray()

        }else{
            return emptyArray()
        }

    }

    public fun getInpupt(): String {
        return input
    }

    public fun setInput(newInput:String) {
        this.input = newInput;
    }
}