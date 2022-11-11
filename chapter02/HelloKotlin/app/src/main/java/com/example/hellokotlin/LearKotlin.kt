package com.example.hellokotlin

import kotlin.math.max

fun main() {
//    println("Hello Kotlin!")
//    var a: Int = 10
//    a = a * 10
//    println("a = " + a)
//
//    var larger: Int = largerNumber(20, 33)
//    println(larger)
//
//    var larger2: Int = largerNumber2(22, 33)
//    println(larger2)
//
//    var larger3 = largerNumber3(22, 33)
//    println(larger3)
//
//    var score = getScore("tom")
//    println(score)

//    testForDemo01()

//   OOPDemo01()
//    OOPDemo02()

//    dataClassDemo()
//    singletonTest()

//    testList()

//    findLongestString()
//    findLongestStringDemo2()
//    testLambda()
//    testLambda02()
//    testLambda03()

    doStudy(null)
}

fun doStudy(study: Study?) {
    study?.readBooks()
    study?.doHomework()
}

fun testLambda03() {
    var list = mutableListOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
    val anyList = list.any { it.length <= 5 }
    val allList = list.all { it.length <= 5 }
    println(anyList)
    println(allList)
}

fun testLambda02() {
    var list = mutableListOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
    val newList = list.filter { it.length <= 5 }.map { it.toUpperCase() }
    for (s in newList) {
        println(s)
    }
}

fun testLambda() {
    var list = mutableListOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
    val newList = list.map { it.toUpperCase() }
    for (s in newList) {
        println(s)
    }
}

fun findLongestString() {
    var list = mutableListOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
    var maxLengthFruit = ""
    for (fruit in list) {
        if (fruit.length > maxLengthFruit.length) {
            maxLengthFruit = fruit
        }
    }
    println("max length fruit is " + maxLengthFruit)
}

fun findLongestStringDemo2() {
    var list = mutableListOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
    val maxLengthFruit = list.maxBy { it.length }
    println("max length fruit is " + maxLengthFruit)
}

//fun singletonTest() {
//    Singleton.singletonTest()
//}

//fun testSet() {
//
//}

fun testList() {
    val list = listOf<String>("Apple", "Banana", "Orange")
    for (fruit in list) {
        println(fruit)
    }

    var list2 = mutableListOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
    list2.add("Watermelon")
    for (fruit in list2) {
        println(fruit)
    }
}

fun dataClassDemo() {
    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
}

//fun OOPDemo02() {
//
//}

//fun OOPDemo01() {
//    val p = Person()
//    p.name = "Jack"
//    p.age = 19
//    p.eat()
//}

fun testForDemo01() {
    for (i in 0..10) {
        println(i)
    }
    for (i in 0 until 10 step 2) {
        println(i)
    }
    for (i in 10 downTo 1)  {
        println(i)
    }
}

fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

fun largerNumber2(num1: Int, num2: Int): Int = max(num1, num2)

fun largerNumber3(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun getScore(name: String) = when (name) {
    "tom" -> 86
    "jim" -> 77
    "jack" -> 100
    else -> 0
}