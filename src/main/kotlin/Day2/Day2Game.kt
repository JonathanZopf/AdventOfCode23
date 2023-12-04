package Day2

data class Day2Game(val id: Int, val draws: List<Day2Draw>) {
    fun getMinimumCubes(): Triple<Int, Int, Int> {
        return Triple(draws.maxOf { it.red }, draws.maxOf { it.green }, draws.maxOf { it.blue })
    }

}
