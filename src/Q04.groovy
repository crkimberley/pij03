import static java.lang.Math.pow

/**
 * Created by crk on 03/08/2016.
 */
class Point {
    double x
    double y
}

Point pointA = new Point()
Point pointB = new Point()
Point pointC = new Point()
Scanner input = new Scanner(System.in)
Scanner entry
println "Enter X & Y coordinates for Point A, with a space between them"
entry = new Scanner(input.nextLine())
pointA.x = entry.nextDouble()
pointA.y = entry.nextDouble()
println "Enter X & Y coordinates for Point B, with a space between them"
entry = new Scanner(input.nextLine())
pointB.x = entry.nextDouble()
pointB.y = entry.nextDouble()
println "Enter X & Y coordinates for Point C, with a space between them"
entry = new Scanner(input.nextLine())
pointC.x = entry.nextDouble()
pointC.y = entry.nextDouble()
double distanceSquaredAB = pow((pointA.x - pointB.x), 2) + pow((pointA.y - pointB.y), 2)
double distanceSquaredAC = pow((pointA.x - pointC.x), 2) + pow((pointA.y - pointC.y), 2)
double distanceSquaredBC = pow((pointB.x - pointC.x), 2) + pow((pointB.y - pointC.y), 2)
// Assuming all distances are different
if (distanceSquaredAB < distanceSquaredAC && distanceSquaredAB < distanceSquaredBC) {
    println "Closest points are A & B"
} else if (distanceSquaredBC < distanceSquaredAB && distanceSquaredBC < distanceSquaredAC) {
    println "Closest points are B & C"
} else {
    println "Closest points are A & C"
}