fun main() {
    val phrase = "Le chat et le chien sont des animaux de compagnie"
    var mots = phrase.split(" ")
    println("Veuillez entrer les mots de la phrase suivante : ")

    for (mot in mots.shuffled()) {
        print("$mot ")
    }
    println()

    var score = 0
    var reponse = readLine()!!
    while (reponse != phrase) {
        println("Vous avez fait une erreur, veuillez réessayer")
        reponse = readLine()!!
    }
    score += 5
    println("Bravo !!!! Vous avez obtenu 5 points, le score total est : $score")
}
