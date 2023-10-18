import java.math.BigInteger

class Operation {


    /**
     * @param candidatePrime: the number which you want to control whether it is prime or not
     * @return returns "true" if related number is true and returns false if related the number is not prime
     *
     */
    fun isPrime(candidatePrime: Int): Boolean {
        if (candidatePrime == 2) return true
        else if (candidatePrime == 1) return false
        else if (candidatePrime < 0) throw Exception("parameter cannot be negative")
        else {

            val sqrtOfNumber: Int = Math.sqrt(candidatePrime.toDouble()).toInt()
            var control = true
            for (i in 2..sqrtOfNumber) {
                if (candidatePrime % i == 0) {
                    control = false
                    break
                }
            }
            return (if (control) true else false)
        }
    }

    fun findPrimesInRanges(firstBorder: Int, secondBorder: Int): ArrayList<Int> {
        if (secondBorder < firstBorder) {
            throw java.lang.Exception("First border should less than second border")
            System.err.println("For example; First Border=10, Second Border =100")
        } else {
            var primesInRange: ArrayList<Int> = ArrayList()
            for (i in firstBorder..secondBorder) {
                if (isPrime(i)) {
                    primesInRange.add(i)
                }
            }

            return primesInRange

        }
    }

    fun findFactorial(number_param:Int): BigInteger {
        var answer:BigInteger=BigInteger.ONE
        for (i in  number_param downTo 1 step 1){
            answer=answer.multiply(i.toBigInteger())
        }
        return answer

    }

}
