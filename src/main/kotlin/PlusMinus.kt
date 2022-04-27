/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>) {
    var positiveNumbers = 0.0
    var negativeNumbers = 0.0
    var zeroNumbers= 0.0
    val ratios : Array<Double>?

    for (i in arr.indices) {
        when {
            arr[i] > 0 -> positiveNumbers++
            arr[i] < 0 -> negativeNumbers++
            arr[i] == 0 -> zeroNumbers++
        }
    }
    ratios = arrayOf((positiveNumbers/arr.size),
        (negativeNumbers/arr.size),
        (zeroNumbers/arr.size))

    for (i in ratios.indices) {
        println(ratios[i])
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
