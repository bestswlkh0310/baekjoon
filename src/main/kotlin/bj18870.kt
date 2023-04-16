fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }
    val arr1 = arr.distinct().sorted()
    arr.forEach { print("${arr1.indexOf(it)} ") }
}