//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   println( contain("Faith","Yiamat","Olosrian").contentToString())
    con(numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))

    bel(   cities = arrayOf("harare","mumbai","dodoma","jakarta"))

}
fun contain(name1: String, name2: String, name3: String):Array<String>{
    var x = arrayOf(name1,name2,name3)
    return x


}
fun con(numbers :Array<Int>){
  var nub = numbers.indexOf(158)
    println(nub)
    var nup = numbers.sortedArrayDescending().reversedArray()
    println(nup.contentToString())
    var b= numbers[1] + numbers[4]
    println(b)

}
fun bel(cities :Array<String>){
    cities.forEachIndexed { idx, city ->
        if (idx in arrayOf(0,1,2,3))
            if (city != null){
                println(city.capitalize())
            }

    }

}
