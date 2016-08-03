/**
 * Created by crk on 02/08/2016.
 */
Scanner input = new Scanner(System.in)
double result, number1, number2
String entry, str1, str2
char operation
// char literals
char minus = '-'
char zero = '0'
char nine = '9'
char point = '.'
boolean correctInput = true
println "Command Line Calculator - using entered expressions, eg. 4.87*96.2"
println "To exit - enter a character other than + - * / as the operator"
while (correctInput) {
    str1 = ""
    println "Enter expression"
    entry = input.nextLine()
    for (int i=0; i < entry.length(); i++) {
        char ch = entry.charAt(i)
        // 1st number string - checking for digits, catering for negative numbers & decimal points
        if ((i==0 && ch == minus) || (ch >= zero && ch <= nine) || (ch == point)) {
            str1 = str1 + entry.charAt(i)
        } else {
            // mathematical operator followed by 2nd number string
            operation = entry.charAt(i)
            str2 = entry.substring(i+1, entry.length())
            break
        }
    }
    number1 = Double.parseDouble(str1)
    number2 = Double.parseDouble(str2)
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
            println "That's not one of the 4 operators allowed - program will terminate"
            correctInput = false
            break;
    }
    if (correctInput) {
        println number1 + " " + operation + " " + number2 + " = " + result
    }
}