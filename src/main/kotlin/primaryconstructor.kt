fun main(){
    var Student=student("keshav",54,"Male","PCM")
    println("Nmae=${Student.name}")
    println("Nmae=${Student.gender}")
    println("Nmae=${Student.idnumber}")
    println("Nmae=${Student.stream}")

    Student.start()
    Student.close()
}
class student(var name: String, var idnumber: Int, var gender: String, var stream: String){

    fun start(){
        println("the class has start on 9 am")
    }
    fun close(){
        println("the class has end on 7pm")
    }

}
