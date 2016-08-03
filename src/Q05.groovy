/**
 * Created by crk on 03/08/2016.
 */
class Rectangle {
    Point upLeft
    Point downRight
}
// class Point already defined in default package - Q04
Scanner input = new Scanner(System.in)
println "Enter X & Y coordinates for opposite corners of a rectangle"
print "upLeft.x, upleft.y, downRight.x, downRight.y - with a space between each coordinate: "
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
double width = rectangle.downRight.x - rectangle.upLeft.x
double height = rectangle.upLeft.y - rectangle.downRight.y
println "Perimeter = " + 2 * (width + height)
println "Area = " + width * height