import static java.lang.Math.abs

/**
 * Created by crk on 02/08/2016.
 */
double d1 = 1.255
double d2 = d1 + 7 - 4 - 3
print "According to the initial calculation in this Java program "
if (d1 == d2) {
    println("1.255 is equal to 1.255 plus 7 minus 7")
} else {
    println("1.255 is NOT equal to 1.255 plus 7 minus 7!")
    println "because d1 = " + d1 + " and d2 = " + d2
    if (abs(d1 - d2) < 10E-6) {
        println "A further check confirms that it's pretty close - within 10E-6"
    }
}