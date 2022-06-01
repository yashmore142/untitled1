fun first() {
    println("1234")

    var i:Int =0
    var j:Int =10

    i++
    println("i= " +i)
    println("j= " +j)

    var name: String ="Yash More"
    var city= "Kolhapur"
    println("$name at $city")

    //type inference
    var rollno=20
    var studentName="Yash"
    var d=24.45
    var f=24.45f

    println("Roll no=$rollno student Name=$studentName Double type=$d float type= $f")

    //array
    var lang= arrayOf("java","kotlin","android","swift")
    for (langs in lang)
    println("$langs ")

    var mark =Array<Int>(10){index -> index + 5}
    for(marks in mark) {
        print("$marks ")
    }
    println()

    for (i in 0..mark.size-1)
    println("${mark[i]}  ${mark.get(i)}")
}
fun main(){
    first()
}