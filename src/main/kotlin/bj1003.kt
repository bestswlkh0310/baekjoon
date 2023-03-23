private var sum0 = 0
private var sum1 = 0

fun main() {
    val n = readln().toInt()
    arr[0][0] = 0
    arr[0][1] = 1
    arr[0][2] = 1
    for (i in 0 until n){
        val inp = readln().toInt()
        fb(inp)
        println("$sum0 $sum1")
        sum0 = 0
        sum1 = 0
    }
}
var arr: MutableList<MutableList<Int>> = Array (2) { Array(40) { 0 }.toMutableList() }.toMutableList()

private fun fb(n: Int): Int {
    if (n == 0) {
        sum0++
        return 0
    }
    if (n == 1) {
        sum1++
        return 1
    }
    if (arr[0][n] != 0){
        return arr[0][n]
    }
    arr[0][n] = fb(n - 1) + fb(n - 2)
    return arr[0][n]
}