 //import random
 import java.util.Random;

 //main function in kotlin language
 fun main() {
     println("Veuillez entrer une taille de mot N")
     val n = readLine()!!.toInt()
     val voca = mutableListOf<String>()
     var score = 0
     val random = Random()
     val words = mutableListOf("chat", "chien", "oiseau", "pomme", "orange", "enfant")
     for (word in words) {
        if (word.length == n) {
            voca.add(word)
        }
    }
    println(voca)
     while (true) {
         println("Veuillez entrer un mot de taille $n")
         val word = readLine()!!
         if (word.length == n) {
             val randomWord = voca[random.nextInt(voca.size)]
             println("mot cache : $randomWord")
             if (randomWord == word) {
                 score += 5
                 println("Bravo !!!! Vous avez obtenu 5 points, le score total est : $score points")
             } else {
                 println("Echec !!!! le score total est : $score points")
             }
         }
     }
 }
 
