Object expressions create objects of anonymous classes, that is, classes that aren't explicitly declared with the class ...

fun main(){
    val testObj =object {
        val num:Int=10
        fun display(){
            println("i am obejct expression")
        }
    }
    println(testObj.num)
    println(testObj.display())
}
