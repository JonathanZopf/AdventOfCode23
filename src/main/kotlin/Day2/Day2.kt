package Day2

import fetchInput

fun main() {
    println(calculateMinimumGamesPower(loadGames(fetchInput(2))))
}

fun excludeNonDigits(input: String): String {
    return input.replace(Regex("[^0-9]"), "")
}

fun loadGames(input: List<String>): List<Day2Game> {
    val res = mutableListOf<Day2Game>()
    for (line in input) {
        val splitById = line.split(":");
        val id = excludeNonDigits(splitById[0]).toInt()
        val draws = splitById[1].split(";")
        val drawList = mutableListOf<Day2Draw>()
        for (draw in draws) {
            val colors = draw.split(",")
            var red = 0;
            var green = 0;
            var blue = 0;
            for (color in colors) {
                when (color.replace(Regex("[^a-z]"), "")) {
                    "red" -> red = excludeNonDigits(color).toInt()
                    "green" -> green = excludeNonDigits(color).toInt()
                    "blue" -> blue = excludeNonDigits(color).toInt()
                }
            }
            drawList.add(Day2Draw(red, green, blue))
        }
        res.add(Day2Game(id, drawList))
    }
    return res
}

fun addUpPossibleGamesId(games: List<Day2Game>, red: Int, green: Int, blue: Int) : Int {
    var res = 0;
    for (game in games) {
        if (game.draws.all { it.possible(red, green, blue) }) {
            res+=game.id
        }
    }
    return res
}

fun calculateMinimumGamesPower(games: List<Day2Game>) : Int {
    var res = 0;
    for (game in games) {
        val (red, green, blue) = game.getMinimumCubes();
        res+=red*green*blue
    }
    return res
}