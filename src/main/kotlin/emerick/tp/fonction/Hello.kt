package emerick.tp.fonction
import java.util.*
fun main(args: Array<String>) {
    /**
     * 1. Explorez la fonction main()
    **/
    /**
     * Etape 4
     **/
    printFormat("1. Explorez la fonction main()")
    printHello()
    println("Hello World! ${args[0]}")
    /**
     * 2. Découvrez pourquoi (presque) tout a une valeur
     **/

    printFormat("2. Découvrez pourquoi (presque) tout a une valeur")
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    /***************************************************************************/
    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

    /**
     * 3. En savoir plus sur les fonctions
     **/

    printFormat("3. En savoir plus sur les fonctions")
    feedTheFish()
    /**
     * 4. Explorez les valeurs par défaut et les fonctions compactes
     **/

    printFormat("4. Explorez les valeurs par défaut et les fonctions compactes")
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter

    /**
     * 5. Commencez avec les filtres
     **/

    printFormat("5. Commencez avec les filtres")
    //Étape 1 : Créer un filtre
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})
    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
}

fun printFormat( chaine : String, loop : Int = 2){
    println("${"\n".repeat(loop)} ************* $chaine ************* ${"\n".repeat(loop)}")
}

fun printHello() {
    println ("Hello World")
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    val food : String
    when (day) {
        "Monday" -> food = "flakes"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }
    return food
}


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}


fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}


