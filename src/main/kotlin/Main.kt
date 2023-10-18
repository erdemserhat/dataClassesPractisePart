fun main(args: Array<String>) {
    //Constructors

    //Secondary Constructor
    var bmw:Car=Car(COLOR.RED)
    println(bmw.toString())


    //Main Constructor
    var mercedes:Car=Car(COLOR.BLACK,12,"Mercedes")
    println(mercedes.toString())

    //How to use a constructor's default values

    //According to declaration
    var reno:Car=Car(COLOR.WHITE,12)
    println(reno.toString())

    //According to named arguments
    var toros =Car(age=2, color=COLOR.BLACK)
    println(toros.toString())

    //Functions can also use default values
    //For example;
    fun add(a:Int,b:Int):Int=a+b
    //Can be written like this
    fun addWithDefault(a:Int=12,b:Int=12)=a+b
    println(addWithDefault())

    println(addWithDefault(b=0))


}