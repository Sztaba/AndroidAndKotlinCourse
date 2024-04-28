package pl.sztaba.a2_rockpaperscissors

fun main() {
    var comChoice: String = ""
    var playChoice: String = ""
    while (playChoice != "stop") {
        println("Rock, Paper or Scissors? Enter your choice (type 'stop' to stop):")
        playChoice = readln()

        val randomNumber = (1..3).random()

        when (randomNumber) {
            1 -> {
                comChoice = "Rock"
            }

            2 -> {
                comChoice = "Paper"
            }

            3 -> {
                comChoice = "Scissors"
            }
        }
        val winner = when {
            playChoice == comChoice -> "Tie"
            playChoice == "Scissors" && comChoice == "Paper" -> "Player wins"
            playChoice == "Rock" && comChoice == "Scissors" -> "Player wins"
            playChoice == "Paper" && comChoice == "Rock" -> "Player wins"
            playChoice == "stop" -> continue
            else -> "Computer wins"
        }
        println("Computer chose $comChoice")
        println("$winner\n")
    }
}