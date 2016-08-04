/**
 * Created by crk on 04/08/2016.
 */
// Only String methods allowed: charAt() & length()
// Note - this implementation would count "bbb" 3 times in "bbbbb"
Scanner input = new Scanner(System.in)
println "Enter a short string and find out how many times it appears in a longer text"
println "Enter a short string"
String shortString = input.nextLine()
println "Enter text"
String text = input.nextLine()
String stringCount = 0
for (int i=0;i<text.length();i++) {
    if (text.charAt(i) == shortString.charAt(0) && text.length() - i >= shortString.length()) {
        for (int j=1;j<shortString.length();j++) {
            if (text.charAt(i+j) != shortString.charAt(j)) {
                break
            }
            if (j == shortString.length() - 1) {
                stringCount++
            }
        }
    }
}
println shortString + " appears " + stringCount + " times"