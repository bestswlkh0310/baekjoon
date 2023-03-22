import java.lang.Exception

fun main() {
    var result = 0

    var nnnn = readln().toInt()
    for (k in 1 .. nnnn)
    {
        var str = readln()
        for (j in 0 until str.length - 1) {
            for (i in 0 until str.length - 1) {
                try {
                    if (str[i] == str[i + 1])
                        str = str.removeRange(i, i + 1)
                } catch (e: Exception) {  }
            }
        }
        var sum = 0
        for (i in str) {
            sum = 0
            for (j in str.indexOf(i) until str.length - 1) {
                if (i == str[j]) {
                    sum++
                }
            }
            if (sum < 1) result++
        }
    }
    println(result)

}