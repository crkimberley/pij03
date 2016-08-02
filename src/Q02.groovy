/**
 * Created by crk on 02/08/2016.
 */
Scanner input = new Scanner(System.in)
double result
boolean correctInput = true
String operator
println "Calculator Program"
while (correctInput) {
    println "Enter 1st number"
    double number1 = input.nextDouble()
    println "Enter 2nd number"
    double number2 = input.nextDouble()
    print "Select operation: (a)ddition, (s)ubtraction, (m)ultiplication, (d)ivision, q to exit:\t"
    char operation = input.next().charAt(0)
    switch (operation) {
        case 'a':
            result = number1 + number2
            operator = " + "
            break;
        case 's':
            result = number1 - number2
            operator = " - "
            break;
        case 'm':
            result = number1 * number2
            operator = " x "
            break;
        case 'd':
            result = number1 / number2
            operator = " / "
            break;
        default:
            println "That's not a correct selection - program will terminate"
            operator = " * * * *  "
            result = 0
            correctInput = false
            break;
    }
    println number1 + operator + number2 + " = " + result + "\n"
}

