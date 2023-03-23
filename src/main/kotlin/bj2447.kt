fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var sb = StringBuilder()
    val n = br.readLine().toInt()

    var arr: MutableList<MutableList<Char>> = Array (n) { Array (n) { '*' }.toMutableList() }.toMutableList()
    roll(arr, 0, 0, n)
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append(arr[i][j])
        }
        sb.append("\n")
    }
    bw.write("$sb")
    bw.flush()
    bw.close()
}

fun roll (arr: MutableList<MutableList<Char>>, x: Int, y: Int, width: Int) {
    if (width == 1 / 3) return
    for (i in width / 3 until width / 3 * 2) {
        for (j in width / 3 until width / 3 * 2) {
            arr[i + x][j + y] = ' '
        }
    }
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (j == 1 && i == 1) continue
            roll(arr, i * width / 3 + x, j * width / 3 + y, width / 3)
        }
    }
}