fun main() {
    val num = readln().toInt()
    for (j in 0 until num) {
        var arr = arrayListOf(1, 1, 1, 2, 2, 3, 4, 5, 7, 9)
        val n = readln().toInt()
        for (i in arr.size - 1..n) {
            arr.add(arr[i] + arr[i - 4])
        }
        println(arr[n - 1])
    }
}