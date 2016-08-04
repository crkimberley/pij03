/**
 * @author crkimberley on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
boolean check = true
print "Palindrome checker - enter text: "
String text = input.nextLine()
for (int i=0;i<text.length()/2;i++) {
    if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
        check = false
        break
    }
}
println "It is" + (check ? "" : " not") + " a palindrome"