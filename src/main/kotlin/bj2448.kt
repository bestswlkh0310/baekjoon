fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var sb = StringBuilder()
    val n = br.readLine().toInt()

    var arr = Array(n) { ArrayDeque(List(n) { '*' }) }
    roll(arr, 0, 0, n)
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append(arr[i][j])
        }
        sb.append("\n")
    }
}

private fun roll (arr: Array<ArrayDeque<Char>>, x: Int, y: Int, width: Int) {
}