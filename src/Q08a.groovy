/**
 * Created by crk on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Enter some text and this program will print each letter on a different line"
String text = input.nextLine()
for (int i=0;i<text.length();i++) {
    println text.charAt(i)
}