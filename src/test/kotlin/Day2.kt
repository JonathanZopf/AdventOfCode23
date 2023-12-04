import Day2.addUpPossibleGamesId
import Day2.loadGames
import org.testng.annotations.Test
class Day2Test {
    @Test
    fun `test fetchInput`() {
        assert(fetchInput(2).size == 100)
    }

    @Test
    fun `test all`() {
        assert(addUpPossibleGamesId(loadGames(fetchInput("Day2InputTest.txt")), 12, 13, 14) == 8)
    }
}