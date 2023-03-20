import kotlin.math.*
fun main() {
    // a + b + c = n (n은 상수 / a, b, c는 자연수)
    // 경우의 수를 구해라 ((1,2,3), (2,1,3)은 같은 경우)
    // 삼각형 조건 맞추기
    var arr = mutableSetOf<MutableSet<Int>>()
    var n = readln().toInt()

    for (i in 1 until n / 2) {
        var j = (n - i) / 2
        var max = max(i, max(j, n - i - j))
        if (max < n - max) {
            arr.add(mutableSetOf(i, j, n-i-j))
        }
    }
    //println(arr)
    println(arr.size)
}