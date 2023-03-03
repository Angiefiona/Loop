fun main(){
    items()
    places()
    value()
    var them = identity("Jayden", "Edgar", "Tracy")
    println(them)
}
fun items(){
    val fruits = arrayOf("Oranges", "Pineapple", "Apples","Banana")
    println(fruits.contentToString())
}
fun places(){
    val cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for(cities in cities)
        println(cities.capitalize())
    cities.forEach {cities -> println(cities.capitalize()) }

}
fun value(){
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers[2].plus(numbers[5]))
    println(numbers.indexOf(158))
    numbers.sort()
    println(numbers.contentToString())
}
fun identity(name1:String,name2:String,name3:String):String{
    var them=(arrayOf(name1,name2,name3))
    return them.contentToString()
}