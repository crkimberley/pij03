/**
 * @author crkimberley on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
print "Relaxed Palindrome checker - enter text: "
text = input.nextLine()
String cleanText = ""
char textChar
for (int i=0;i<text.length();i++) {
    textChar = text.charAt(i)
    if (textChar.isLetter()) {
        cleanText = cleanText + textChar.toLowerCase()
    }
}
boolean check = true
for (int i=0;i<cleanText.length()/2;i++) {
    if (cleanText.charAt(i) != cleanText.charAt(cleanText.length() - i - 1)) {
        check = false
        break
    }
}
println "It is" + (check ? "" : " not") + " a palindrome"
