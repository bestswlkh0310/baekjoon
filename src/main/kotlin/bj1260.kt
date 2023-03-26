import java.lang.Integer.*
import java.util.*

fun main() {
    var queue: Queue<Pair<Int,Int>> = LinkedList()
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    var arr: Array<Pair<Int, Int>> = Array (b) { Pair(0, 0) }

    for (i in 0 until b) {
        val (d, f) = readln().split(" ").map { it.toInt() }
        arr[i] = Pair(min(d, f), max(d, f))
        if (d == c) queue.add(Pair(d, f))
        if (f == c) queue.add(Pair(f, d))
    }
//    arr.forEach { println(it) }

    print("$c ")
    var last = 0
    while (!queue.isEmpty()) {
        val (first, second) = queue.poll()
        val aa = arr.find { it.first == second }
        if (aa != null) {
            queue.add(aa)
            print("${aa.first} ")
        }
        last = second
    }
    print(last)
}