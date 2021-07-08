package com.example.kotlininternapp.model

class Finder {

    var array: Array<Int> = emptyArray();
    var flag = false;

    constructor(string: String){
        val converter = Converter()
        converter.setInput(string)
        this.array = converter.toArray()
        if(array.size >= 3){
            this.flag = true
        }

    }


    public fun find(): String {

        if (!flag){
            return "Not enough arguments"
        }

        var ifEven = false
        var calcEven: Int = 0
        var misfit = 0
        for (i in 0..2)
        {
            if (this.array[i] %2 == 0){
                calcEven += 1;
            }
        }

        if(calcEven >= 2){
            ifEven = true
        }

        for (i in this.array.indices-1){

            if (array[i]%2 != 0 && ifEven){
                misfit = array[i]
                break
            }
            if (array[i]%2 == 0 && !ifEven){
                misfit = array[i]
                break
            }



        }
        return misfit.toString()
    }





}