import Day1.addUp
import Day1.getDigitCombination
import Day2.calculateMinimumGamesPower
import Day2.loadGames
import org.testng.annotations.Test

class Day1Test {
    @Test
    fun `test replaceWordsWithDigits`() {
        assert(
            addUp(listOf("two1nine", "eightwothree", "abcone2threexyz", "xtwone3four", "4nineeightseven2", "zoneight234", "7pqrstsixteen"))
                == 281) }
    @Test
    fun `test getDigitCombination`() {
        assert(getDigitCombination("1abc2") == 12)
        assert(getDigitCombination("pqr3stu8vwx") == 38)
        assert(getDigitCombination("a1b2c3d4e5f") == 15)
        assert(getDigitCombination("treb7uchet") == 77)
    }

    @Test
    fun `test addUp`() {
        assert(addUp(listOf("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet")) == 142)
    }

    @Test
    fun `test calculateMinimumGamesPower`() {
        assert(calculateMinimumGamesPower(loadGames(fetchInput("Day2InputTest.txt"))) == 2286)
    }
}