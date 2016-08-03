/**
 * Created by crk on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Point inside or outside a couple of rectangles?"
println "Enter X & Y coordinates for opposite corners of 2 rectangles and a 5th point"
println "upLeft.x, upleft.y, downRight.x, downRight.y - for rectangle A then rectangle B"
print "then point.x, point.y - with a space between each coordinate: "
Scanner entry = new Scanner(input.nextLine())
Point upLeftA = new Point()
upLeftA.x = entry.nextDouble()
upLeftA.y = entry.nextDouble()
Point downRightA = new Point()
downRightA.x = entry.nextDouble()
downRightA.y = entry.nextDouble()
Rectangle rectangleA = new Rectangle()
rectangleA.upLeft = upLeftA
rectangleA.downRight = downRightA
Point upLeftB = new Point()
upLeftB.x = entry.nextDouble()
upLeftB.y = entry.nextDouble()
Point downRightB = new Point()
downRightB.x = entry.nextDouble()
downRightB.y = entry.nextDouble()
Rectangle rectangleB = new Rectangle()
rectangleB.upLeft = upLeftB
rectangleB.downRight = downRightB
Point point = new Point()
point.x = entry.nextDouble()
point.y = entry.nextDouble()
boolean inA = false
boolean inB = false
if ((point.x >= rectangleA.upLeft.x && point.x <= rectangleA.downRight.x) &&
        (point.y >= rectangleA.downRight.y && point.y <= rectangleA.upLeft.y)) {
    inA = true
}
if ((point.x >= rectangleB.upLeft.x && point.x <= rectangleB.downRight.x) &&
        (point.y >= rectangleB.downRight.y && point.y <= rectangleB.upLeft.y)) {
    inB = true
}
if (inA && inB) {
    println "The point is inside both rectangles"
} else if (inA) {
    println "The point is only inside rectangle A"
} else if (inB) {
    println "The point is only inside rectangle B"
} else {
    println "The point is outside both rectangles"
}