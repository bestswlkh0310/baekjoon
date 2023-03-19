import java.lang.Exception

fun main() {
    val (n, c) = readln().split(" ").map { it.toInt() }

    var arr: MutableList<Int> = arrayListOf()
    var arrD: MutableList<Int> = arrayListOf()

    for (i in 0 until n) {
        val a = readln().toInt()
        arr.add(a)
    }
    arr.sort()

    // 시간 초과 문제 후보
    for (i in 0 until n - 1) {
        arrD.add(arr[i + 1] - arr[i])
    }

    if (n == c) return println(arrD.min())

    while (arrD.size >= c) {
        //println(arrD)
        val minIdx = arrD.indexOf(arrD.min())
        try {
            arrD[minIdx - 1] = arrD[minIdx - 1] + arrD[minIdx]
            arrD.removeAt(minIdx)
        } catch (e: Exception) {
            try {
                arrD[minIdx + 1] = arrD[minIdx + 1] + arrD[minIdx]
                arrD.removeAt(minIdx)
            } catch (e: Exception) {}
        }
/*        if (arrD[minIdx - 1] is Int) {
            if (arrD[minIdx - 1] > arrD[minIdx + 1]) {
                arrD[minIdx + 1] = arrD[minIdx + 1] + arrD[minIdx]
            } else {
                arrD[minIdx - 1] = arrD[minIdx - 1] + arrD[minIdx]
            }
            arrD.removeAt(minIdx)
        }*/
        //println(arrD)
    }
    println(arrD.min())
}