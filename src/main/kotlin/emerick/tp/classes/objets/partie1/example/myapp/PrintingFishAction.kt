package emerick.tp.classes.objets.partie1.example.myapp

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}