/**
 * Created by crk on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Enter some text and find out how many times a specified letter appears"
println "Enter text"
String text = input.nextLine()
print "Specify a letter: "
char letter = input.next()
int letterCount = 0
for (int i=0;i<text.length();i++) {
    if (text.charAt(i) == letter) {
        letterCount++
    }
}
println "There were " + letterCount + " '" + letter + "'s"