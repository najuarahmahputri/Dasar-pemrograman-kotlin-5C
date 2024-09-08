fun main(args: Array<String>) {
    var charA : Char = 'A'
    //println(charA == 65)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val stra: String = charA.toString()
    println("Kini charA sudah menjadi String = " + stra)
}