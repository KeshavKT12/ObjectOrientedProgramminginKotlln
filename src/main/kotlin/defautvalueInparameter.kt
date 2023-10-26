fun main(){
    val user1 = User("keshav")
    val user2 = User("arun","parmar")
    val user3 = User("rohit","sharma",22)

  println("name=${user1.firstname}")
    println("lastname=${user1.lastname}")
    println("age=${user1.age}")
    println("\n")
    println("nmae=${user2.firstname}")
    println("lastname=${user2.lastname}")
    println("age=${user2.age}")
    println("\n")
    println("nmae=${user3.firstname}")
    println("lastname=${user3.lastname}")
    println("age=${user3.age}")
}
class User(var firstname:String,var lastname:String="upadhyay",var age:Int=0)