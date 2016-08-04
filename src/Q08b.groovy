/**
 * Created by crk on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Enter some text and this program will print each word on a different line"
Scanner text = new Scanner(input.nextLine())
while (text.hasNext()) {
    println text.next()
}