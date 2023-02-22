fun main() {
 women()
    numbers()

    cities()
    println(animals("Cow","Dog","Cat"))


}
fun women(){
    var women = arrayOf("Faith","Maggie","Mary","Grace")
    println(women.contentToString())
}
fun cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for(x in cities)
     println(x.capitalize())



}
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1].plus(numbers[4]))
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
fun animals(an1:String,an2:String,an3:String):String{
    var animals = arrayOf(an1,an2,an3)
    return animals.contentToString()






}