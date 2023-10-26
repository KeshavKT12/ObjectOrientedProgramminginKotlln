//fun main(){
//    val result=database.getResult()
//    println(result)
//}
//class database private constructor(){
//    companion object{
//        private var result: database?=null
//        fun getResult():database?{
//            if(result==null){
//                result=database()
//            }
//            return result
//        }
//    }
//}

// same thing is run on using object to get this output

fun main(){
    println(database)
}
object database{
    init {
        println("database create")
    }
}