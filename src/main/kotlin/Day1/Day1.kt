package Day1

import fetchInput
import kotlin.text.StringBuilder

fun main(args: Array<String>) {
    println("Result: " + addUp(fetchInput(1)))
}

fun addUp(input: List<String>): Int {
    var res = 0
    input.forEach { line ->
        res += getDigitCombination(line)
    }
    return res
}

internal fun getDigitFromWord(input: String): String? {
    if (input.contains("one")) {
        return "1"
    }
    if (input.contains("two")) {
        return "2"
    }
    if (input.contains("three")) {
        return "3"
    }
    if (input.contains("four")) {
        return "4"
    }
    if (input.contains("five")) {
        return "5"
    }
    if (input.contains("six")) {
        return "6"
    }
    if (input.contains("seven")) {
        return "7"
    }
    if (input.contains("eight")) {
        return "8"
    }
    if (input.contains("nine")) {
        return "9"
    }
    return null
}

fun getDigitCombination(input: String): Int {
    var leftDigit: String? = null
    var rightDigit: String? = null
    //Go from left to right
    var savedChars = StringBuilder()
    for (currentChar in input) {
        if (currentChar.isDigit()) {
            leftDigit = currentChar.toString()
            break
        }
        savedChars.append(currentChar)
        val digit = getDigitFromWord(savedChars.toString())
        if (digit != null) {
            leftDigit = digit
            break
        }
    }
    //Go from right to left
    savedChars = StringBuilder()
    for (currentChar in input.reversed()) {
        if (currentChar.isDigit()) {
            rightDigit = currentChar.toString()
            break
        }
        savedChars.append(currentChar)
        val digit = getDigitFromWord(savedChars.toString().reversed())
        if (digit != null) {
            rightDigit = digit
            break
        }
    }
    println("leftDigit: $leftDigit, rightDigit: $rightDigit")
    return leftDigit!!.toInt() * 10 + rightDigit!!.toInt()
}