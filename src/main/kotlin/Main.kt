fun main(args: Array<String>) {
    println("Hello World!")
    var oprtn:Operation=Operation()
    println(oprtn.isPrime(12123))

    var myPrimes:ArrayList<Int> = oprtn.findPrimesInRanges(50,60)

    for (element in myPrimes.withIndex()){
        println(element)
    }

    println(oprtn.findFactorial(0))

    var user:User=User("serhat","erdem",22,"serhat51","fdsf")


}