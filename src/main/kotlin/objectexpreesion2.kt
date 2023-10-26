
// interfae useing without class used on objects also like this
fun main(){
    val obj1 = object : cloneable{
        override fun clone() {
            println("i am clone")
        }

    }
    obj1.clone()
}
interface cloneable {
    fun clone()
}