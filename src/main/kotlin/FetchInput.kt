import java.net.URL
import org.jsoup.Jsoup
import java.nio.file.Files
import java.nio.file.Paths

fun fetchInput(day: Int): List<String> {
    val fileName = "/Users/jonathan/Programms/AdventOfCode23/AdventOfCode23/src/main/resources/Day${day}Input.txt"
    return Files.readAllLines(Paths.get(fileName))
}
fun fetchInput(fileName: String): List<String> {
    val fileName = "/Users/jonathan/Programms/AdventOfCode23/AdventOfCode23/src/main/resources/${fileName}"
    return Files.readAllLines(Paths.get(fileName))
}