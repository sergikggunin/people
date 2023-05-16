fun main() {
    val likes = 123  // количество лайков

    val lastDigit = likes % 10
    val lastTwoDigits = likes % 100

    val word = when {
        lastTwoDigits in 11..14 -> "человек"
        lastDigit == 1 -> "человеку"
        lastDigit in 2..4 -> "человекам"
        else -> "человек"
    }

    println("Понравилось $likes $word")
}