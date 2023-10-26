////Lazy initialization is a delegation that initializes something only once and only when it's called. It's meant to avoid unnecessary object creation.
//fun main(){
//    val user1=User("keshav","upadhyay",25)
//    val user2 by lazy {
//        User("anshul","vyas",22)
//    }
//    println(message = user2.firstname)
//}
//class Usser(var name:String,var lastname:String,var age:Int){
//    init {
//        println("the user was ${name} created")
//    }
//}