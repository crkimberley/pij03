/**
 * @author crkimberley on 05/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Mail Server Program"
boolean quit = false

// Email return address
boolean done = false
while (!done) {
    print ">>> "
    text = input.nextLine()
    if (text == "QUIT") {
        quit = true
        break
    }
    done = true
    println "OK"
}

// Email recipient
done = false
while (!done && !quit) {
    print ">>> "
    text = input.nextLine()
    if (text == "QUIT") {
        quit = true
        break
    }
    done = true
    println "OK"
}

// Body of email
String body = ""
done = false
while (!done && !quit) {
    print ">>> "
    text = input.nextLine()
    if (text == "QUIT") {
        quit = true
        break
    }
    if (text == "DATA") {
        while (true) {
            text = input.nextLine()
            if (text == ".") {
                break
            }
            body = body + text + "\n"
        }
        done = true
    } else {
        println "Invalid command"
    }
}

// Print email details & message
if (!quit) {
    println "Sending email..."
    println "from: "
    println "to: "
    print body
}