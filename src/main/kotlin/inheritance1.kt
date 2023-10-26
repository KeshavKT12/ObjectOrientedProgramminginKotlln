//import rouondButton as rouondButton1
//
////In Kotlin, it is possible to inherit class properties and functions from one class to another.and
////overrider also
//fun main(){
//val View = view()
//    val Button = button("Login","center")
//    val Roundbutton = rouondButton1("Sign up","center",30)
//   View.draw()
//    Button.draw()
//    Roundbutton.draw()
//}
//open class view(){
//    open fun draw(){
//        println("Drwainf he view")
//    }
//}
//open  class button(val text: String,var properDetail:String): view() {
//    override fun draw() {
//        //here is the code for draw button
//        println("Drwaint the button")
//        super.draw()
//    }
//}
//class rouondButton(text: String,properDetail: String,val corners:Int):button(text, properDetail){
//    override fun draw() {
//        println("Drawing the round button")
//        super.draw()
//    }
//}
