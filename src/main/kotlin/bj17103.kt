import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var sb = StringBuilder()
    val inp = br.readLine().toInt()
    for (s in 0 until inp) {
        var n = br.readLine().toInt()
        var sum = 0

        loop@
        for (i in 2 .. n / 2) {
            if (i % 2 == 0 && i != 2) continue@loop
            if ((n - i) % 2 == 0 && (n - i) != 2) continue@loop
            for (j in 3 .. sqrt(i.toDouble()).toInt() step 2) {
                if (i % j == 0 && n != j) continue@loop
            }
            for (j in 3 .. sqrt((n - i).toDouble()).toInt() step 2) {
                if ((n - i) % j == 0 && j != (n - i)) continue@loop
            }
            sum++
        }
        sb.append("$sum\n")
    }
    bw.write("$sb")
    bw.flush()
    bw.close()
}
