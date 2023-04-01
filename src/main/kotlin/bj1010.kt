import java.lang.Long.*

fun main() {
    val n = readln().toLong()

    for (i in 0 until n) {
        val (a, b) = readln().split(" ").map { it.toLong() }

        val mx = max(a, b)
        val mn = min(a, b)

        var sum = 1L

        for (i in (mx - mn + 1) .. mx) {
            sum *= i
        }
        println(sum)
        for (i in 1 .. mn) {
            sum /= i
        }
        println(sum)
    }
}