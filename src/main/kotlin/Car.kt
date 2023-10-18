data class Car(
    //Main Constructor
    val color:COLOR=COLOR.BLACK,
    val age:Int=0,
    val model:String="Example Model"
) {
    //Secondary constructor must be implemented in the body of class
    constructor(color: COLOR):this(color,0,""){
        //code that runs when the secondary constructor is called

    }
}