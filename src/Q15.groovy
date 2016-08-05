/**
 * @author crkimberley on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
print "Relaxed Palindrome checker - enter text: "
String text = input.nextLine()
String cleanText = ""
for (int i=0;i<text.length();i++) {
    if (((char) text.charAt(i)).isLetter()) {
        cleanText = cleanText + ((char) text.charAt(i)).toLowerCase()
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
