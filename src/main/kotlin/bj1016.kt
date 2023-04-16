import java.lang.Math.sqrt

fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }
    var sum = 0L
    var arr = arrayListOf<Long>()
    for (i in 2L..sqrt(b.toDouble()).toLong()) {
        arr.add(i * i)                                                                                                                                                          
    }
    println(arr)
    loop@
    for (i in a..b) {
        for (j in arr) {
            if (i < j) break
            if (i % j == 0L) continue@loop
        }
        sum++
    }
    println(sum)
}