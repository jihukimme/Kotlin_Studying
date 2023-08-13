package com.example.practice

class sample1 {
}

fun main(){
    //3. String Template

//    val name = "jihu"
//    val lastName = "kim"
//    println("my name is ${name + lastName}I'm 23")
//    println("this is 2\$a")

    //forAndWhile()
    nullcheck()
}

//1.함수

fun helloWorld(){
    println("Hello World!")
}

fun add (a: Int, b: Int): Int{
    return a+b
}

//2. val vs var
//val = value

fun hi(){
    val a: Int = 10
    var b: Int = 9

    //val변경불가 var변경가능
    b= 100

    val c = 100
    var d = 100

    var name:String = "jihu"
}

//4. 조건식
fun maxBy(a: Int, b:Int): Int{
    if(a>b)
        return a
    else
        return b
}

fun maxBy2(a:Int, b:Int): Int = if(a>b) a else b

fun checkNum(score: Int){
    when(score){
        0->println("this is 0")
        1->println("this is 1")
        2,3->println("this is 2 or 3")
    }

    var b: Int = when(score){
        1-> 1
        2-> 2
        else -> 3
    }

    when(score){
        in 90..100->println("you are genius")
        in 10..80->println("not bad")
        else -> println("okay")
    }
}

//Expression vs  Statment

//5. Array and List
// Array

//List 1.List 2.MutableList

fun array(){
    val array :Array<Int> = arrayOf(1,2,3)
    val list :List<Int> = listOf(1,2,3)

    val array2 :Array<Any> = arrayOf(1, "d", 3.4f)
    val list2 :List<Any> = listOf(1,"d", 11L)

    array[0] = 3
    val result :Int = list.get(0)

    val arrayList :ArrayList<Int> = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

// 6.for / while

fun forAndWhile(){
    val students :ArrayList<String> = arrayListOf("kim", "lee", "park", "sung")

    for(name:String in students){
        println("${name}")
    }

    for((index:Int, name:String) in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }

    var sum :Int = 0
    for(i:Int in 1..10 step 2){
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}

//7.Nullable / NonNull

fun nullcheck(){
    //NPE: NULL pointer Exception

    var name: String = "jihu"
    var nullName : String? = null

    var nameInupperCase: String = name.toUpperCase()

    var nullNameInUpperCase :String? = nullName?.toUpperCase()

    // ?:

    val lastName : String? = null
    val fullName : String = name + (lastName?: "No lastName")

    println(fullName)

    //!!

}

fun ignoreNulls(str: String?){
    val mNotNull :String = str!!
    val upper: String = mNotNull.toUpperCase()

    val email :String? = "jihu@naver.com"
    email?.let{
        println("my email is ${email}")
    }
}
