/**
 * @author crkimberley on 05/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Mail Server Program"
print ">>> "
String fromCommand = input.nextLine()
println "OK"
print ">>> "
String toCommand = input.nextLine()
println "OK"
print ">>> "
String bodyCommand = input.nextLine()
String body = ""
String lineOfBody
while (true) {
    lineOfBody = input.nextLine()
    if (lineOfBody == ".") {
        break
    }
    body = body + lineOfBody + "\n"
}
println "Sending email..."
println "from: "
println "to: "
print body
println ">>> "
