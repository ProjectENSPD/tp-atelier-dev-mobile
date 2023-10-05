package emerick.tp.classes.objets.partie1.example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()

    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printSize()


    //******** SOUS CLASSE HERITAGE ***********
    println("******** SOUS CLASSE HERITAGE ***********");
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()
    println("********CLASSE ABSTRAITE / SOUS CLASSE HERITAGE ***********");
    makeFish()

    println("******** DATA CLASS ***********");
    makeDecorations()

    println("******** ENUM CLASS ***********");
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}