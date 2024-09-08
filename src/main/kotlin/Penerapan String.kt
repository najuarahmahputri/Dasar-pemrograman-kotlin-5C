fun main(args: Array<String>) {
    //Character accurrence in a sentence analysis
    //the string that we want to analyze
    var s =
        "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    //counters initialization
    var vowe1Count = 0
    var consonanCount = 0

    //definition of character groups
    val vowe1s = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    //main loop
    for (c in s) {
        if (vowe1s.contains(c)) {
            vowe1Count++
        } else if (consonants.contains(c)) {
            consonanCount++
        }
    }
    println("Vowe1s: $vowe1Count")
    println("Consonants: $consonanCount")
    println("Other characters: ${s.length - (vowe1Count + consonanCount)}")
}