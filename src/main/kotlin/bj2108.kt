import kotlin.math.round

fun main() {
    val n = readln().toInt()
    var arr = ArrayDeque<Int>()
    var nArr = Array (8010) { 0 }

    for (i in 0 until n) {
        val a = readln().toInt()
        arr.add(a)
        nArr[a + 4004]++
    }
    arr.sort()
    println("%.0f".format(arr.average()))
    println(arr[arr.size / 2])
//    println(arr[nArr.indexOf(nArr.max()) - 4004])
    println(arr.max() - arr.min())
}