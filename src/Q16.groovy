/**
 * @author crkimberley on 05/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Enter a number with commas & decimal point, eg. 23,419.34 and program will divide by 2"
print "Enter number (text): "
String text = input.nextLine()
String numberString1 = ""
String numberString2 = ""
int pointPosition = 0nu
for (int i=0;i<text.length();i++) {
    if (text.charAt(i) != ',') {
        if (text.charAt(i) != '.') {
            numberString1 = numberString1 + text.charAt(i)
        } else {
            pointPosition = i
            break
        }
    }
}
int wholeNumber = Integer.parseInt(numberString1)
numberString2 = text.substring(pointPosition + 1)
