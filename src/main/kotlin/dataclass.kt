fun main(){
    val User = user("keshav","upadhyay")
    println( User.toString())
}
data class user(val name:String,val lasname:String)