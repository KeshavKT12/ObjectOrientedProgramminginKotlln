fun main(){
    SharingWidgth.incrementfbLikes()
    SharingWidgth.incrementfbLikes()
    SharingWidgth.incrementfbLikes()
    SharingWidgth.incrementTwiterlikkes()
    SharingWidgth.display()
}
object SharingWidgth{
    private var tiwiterLikes=0
    private var fbLikes=0
    fun incrementTwiterlikkes()= tiwiterLikes++
    fun incrementfbLikes()= fbLikes++
    fun display()= println("facebook---${fbLikes},twitter --- ${tiwiterLikes}")

}