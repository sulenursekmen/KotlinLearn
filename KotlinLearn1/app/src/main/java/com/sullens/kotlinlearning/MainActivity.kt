package com.sullens.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //camelCase
        // println("hello kotlin")
        //Variables

        var x=5;
        var y=4;
        println(x*y)

        //Constants
        val name="Julia"
        val a=5

        //Defining
        val myInteger : Int

        //Initialize
        myInteger=10

        val z : Int=5

        //Double%Float

        val pi=3.14
        println(pi*2)
        //Float virgülden sonra daha cok sayı gösterir biti fazla
        val myFloat=3.14f
        println(myFloat*2)

        //Long
        var myLong:Long=100
        println(myLong)

        //String
        println("-------String--------")

        val myString="julia"
        val larsName:String="Lars"

        //Boolean
        var myBoolean:Boolean=true
        myBoolean=false

        //&& and || or

        //Conversion
        println("-------Conversion--------")
        var myNumber=10
        var myLongNumber=myNumber.toLong()
        println(myLongNumber)

        //Collections
        //Array
        println("-------Array--------")
        val myArray= arrayOf("James","Julia","Rob","Lars")
        //index
        println(myArray[0])
        myArray[0]="James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammett")

        val numberArray= doubleArrayOf(1.0,2.0,3.0,4.0,5.0)
        val mixedArray= arrayOf("Sule",6)


        //List - ArrayList
        println("-------List--------")

        val myMusician= arrayListOf<String>("m","s")

        myMusician.add("u")
        println(myMusician[2])
        myMusician.add(0,"n")

        val myMixedArrayList=ArrayList<Any>()
        myMixedArrayList.add("you")
        myMixedArrayList.add(555)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        //Set bir eleman bir kez var olur
        println("-------Set--------")

        val myExampleArray= arrayOf(1,1,2,3,4)
        println("first element : ${myExampleArray[0]}")

        val mySet= setOf<Int>(1,1,2,3)
        println(mySet.size)

        //For Each
        //it her bir elemanı bastırır
        mySet.forEach { println(it*3) }

        val myStringSet=HashSet<String>()
        myStringSet.add("Sule")
        myStringSet.add("Sule")
        println(myStringSet.size)

        //Map - HashMap
        println("-------Map--------")

        //Key - Value

        val fruitArray= arrayOf("Apple","Banana")
        val caloriesArray= arrayOf(100,200)

        println("${fruitArray[0]} : ${caloriesArray[0]}")


        val fruitCalorieMap= hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",200)
        println(fruitCalorieMap["Apple"])

        val myHashMap=HashMap<String,String>()

        val myNewMap= hashMapOf<String,Int>("A" to 1,"B" to 2)
        println(myNewMap["A"])

        //Operator
        println("-------Operator--------")
        var m =5
        var s=6
        println(m<s)
        println(m<s && 1>2)
        println(m<s || 1>2)

        //Remainder
        println(10%4)

        // If Control
        println("-------If Control--------")

        val myNumberAge=24
        if (myNumberAge<20){
            println("<20")
        }else if (myNumberAge >=20 && myNumberAge<30) {
            println("20-30")
        }else{
            println(">30")
        }

        // Switch - When
        println("-------Switch--------")

        val day=3
        var dayString=""

        when(day){
            1 -> dayString="Monday"
            2 -> dayString="Tuesday"
            3 -> dayString="Wednesday"
            else -> dayString=""
        }
        println(dayString)


        //Loops
        //For Loop
        println("-------For Loop--------")
        val myArrayofNumbers= arrayOf(11,22,33,44,55,66,77,88,99,10)
        myArrayofNumbers[0]

        for (number in myArrayofNumbers){
            val y=number/3*5
            println(y)
        }


        for (i in myArrayofNumbers.indices){
            val t=myArrayofNumbers[i]/3*5
        }


        for (q in 0..9){
            println(q)
        }

        val myStringArrayList=ArrayList<String>()
        myStringArrayList.add("Sule")
        myStringArrayList.add("Nur")
        myStringArrayList.add("Sekmen")

        for (str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach{ println(it)}

        //While Loop
        println("-------While Loop--------")

        var w=0
        while (w<10){
            println(w)
            w++
        }


    }
}