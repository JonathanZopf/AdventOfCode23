package Day2

public class Day2Draw(val red: Int, val green: Int, val blue: Int) {
    fun possible(red: Int, green: Int, blue: Int): Boolean {
        return this.red <= red && this.green <= green && this.blue <= blue
    }
}