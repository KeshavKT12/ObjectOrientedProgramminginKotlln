import java.awt.Color
//In Kotlin, an interface is a collection of abstract methods and properties that define a common contract for classes that implement the interface
fun main(){

}
interface Engine{
    fun startEngine()
}
class car(var name:String,var color:String,var doors:Int):Engine{
    override fun startEngine() {
        println("the car id starting the engine")
    }

}
class truck(var name:String,var color:String,var doors:Int):Engine{
    override fun startEngine() {
        println("the truck id starting the engine")
    }

}
class plane(var name:String,var color:String,var doors:Int):Engine{
    override fun startEngine() {
        println("the plane id starting the engine")
    }

}

