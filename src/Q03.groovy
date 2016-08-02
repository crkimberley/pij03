/**
 * Created by crk on 02/08/2016.
 */
Scanner input = new Scanner(System.in)
double result, number1, number2
String entry
char operation
boolean correctInput = true
println "Command Line Calculator"
while (correctInput) {
    println "Enter: No.1 Operation No.2"
    entry = input.nextLine()
    Scanner expression = new Scanner(entry)
    number1 = Double.parseDouble(expression.next())
    println number1
    operation = expression.next().charAt(0)
    println operation
    number2 = Double.parseDouble(expression.next())
    println number2
    switch (operation) {
        case '+':
            result = number1 + number2
            break;
        case '-':
            result = number1 - number2
            break;
        case '*':
            result = number1 * number2
            break;
        case '/':
            result = number1 / number2
            break;
        default:
            println "That's not a correct selection - program will terminate"
            result = 0
            correctInput = false
            break;
    }
    println number1 + " " + operation + " " + number2 + " = " + result
}