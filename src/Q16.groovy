/**
 * @author crkimberley on 05/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Enter a number with commas & decimal point, eg. 23,419.34 and program will divide by 2"
print "Enter number (text): "
String text = input.nextLine()
String wholeNumberString = ""
int pointPosition = 0
for (int i=0;i<text.length();i++) {
    if (text.charAt(i) != ',') {
        if (text.charAt(i) != '.') {
            wholeNumberString = wholeNumberString + text.charAt(i)
        } else {
            pointPosition = i
            break
        }
    }
}
int wholeNumber = Integer.parseInt(wholeNumberString)
int wholeNumberResult = wholeNumber / 2
String decimalString = text.substring(pointPosition + 1)
// Add digit to left-hand end to retain leading zeroes & include any remainder from whole number division
int remainder = wholeNumber % 2
String remainderLeadString = "" + (remainder + 2)
String adjustedDecimalString = remainderLeadString + decimalString
int adjustedDecimalNumber = Integer.parseInt(adjustedDecimalString)
int adjustedDecimalResult = adjustedDecimalNumber / 2
// Remove leading adjusting digit for decimal result
String adjustedDecimalResultString = "" + adjustedDecimalResult
String decimalResultString = adjustedDecimalResultString.substring(1)

println text + " / 2 = " + wholeNumberResult + "." + decimalResultString