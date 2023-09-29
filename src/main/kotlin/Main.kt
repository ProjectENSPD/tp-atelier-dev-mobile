fun main() {
    println("Hello Mr Hyoubissie!")
//question 1
    var dirtyLevel1 = 20
    val waterFilter1 = { dirty : Int -> dirty / 2}
    println(waterFilter1(dirtyLevel1))

//question 2
    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter2))

//question 3
    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel2 = 19
    dirtyLevel2 = updateDirty(dirtyLevel2) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel2)
}
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 1

