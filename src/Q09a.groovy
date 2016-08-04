/**
 * Created by crk on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Enter some text and find out how many times the letter e appears"
String text = input.nextLine()
int eCount = 0
for (int i=0;i<text.length();i++) {
    if (text.charAt(i) == 'e' as char) {
        eCount++
    }
}
println "There were " + eCount + " 'e's"