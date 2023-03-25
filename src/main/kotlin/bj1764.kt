import java.lang.StringBuilder

fun main() {
    val sb = StringBuilder()
    val (a, b) = readln().split(" ").map { it.toInt() }
    var arr1 = arrayListOf<String>()
    var arr2 = arrayListOf<String>()
    for (i in 0 until a) {
        arr1.add(readln())
    }
    for (i in 0 until b) {
        arr2.add(readln())
    }
    var sum = 0
    for (i in 0 until b) {
        val t = arr1.filter { it == arr2[i] }
        if (t.isNotEmpty()) {
            sb.append("${t[0]}\n")
            sum++
        }
    }
    println(sum)
    println(sb)
}