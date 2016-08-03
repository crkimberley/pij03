/**
 * Created by crk on 03/08/2016.
 */
// Point & Rectangle classes defined in previous questions
Scanner input = new Scanner(System.in)
println "Point inside or outside a rectangle?"
println "Enter X & Y coordinates for opposite corners of a rectangle and a 3rd point"
print "upLeft.x, upleft.y, downRight.x, downRight.y, point.x, point.y - with a space between each coordinate: "
Scanner entry = new Scanner(input.nextLine())
Point upLeft = new Point()
upLeft.x = entry.nextDouble()
upLeft.y = entry.nextDouble()
Point downRight = new Point()
downRight.x = entry.nextDouble()
downRight.y = entry.nextDouble()
Rectangle rectangle = new Rectangle()
rectangle.upLeft = upLeft
rectangle.downRight = downRight
Point point = new Point()
point.x = entry.nextDouble()
point.y = entry.nextDouble()
if ((point.x >= rectangle.upLeft.x && point.x <= rectangle.downRight.x) &&
        (point.y >= rectangle.downRight.y && point.y <= rectangle.upLeft.y)) {
    println "That point is inside the rectangle"
} else {
    println "That point is outside the rectangle"
}