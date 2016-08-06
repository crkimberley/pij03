/**
 * @author crkimberley on 05/08/2016.
 */
Scanner input = new Scanner(System.in)
boolean quit = false
boolean done, command
String text, mailTo, mailFrom
println "Mail Server Program"

// Email return address
done = false
while (!done) {
    print ">>> "
    text = input.nextLine()
    if (text == "QUIT") {
        quit = true
        break
    }
    if (text.length() > 12) {
        if (text.substring(0,10) == "MAIL FROM:") {
            int atCount = 0
            for (int i=10;i<text.length();i++) {
                if (text.charAt(i) == '@' as char) {
                    atCount++
                }
            }
            if (atCount == 1) {
                mailFrom = text.substring(10)
                done = true
                println "OK"
            } else {
                println "Invalid email"
            }
        } else {
            print "Command invalid"
        }
    }
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
    if (text.length() > 10) {
        if (text.substring(0,8) == "RCPT TO:") {
            int atCount = 0
            for (int i=8;i<text.length();i++) {
                if (text.charAt(i) == '@' as char) {
                    atCount++
                }
            }
            if (atCount == 1) {
                mailTo = text.substring(8)
                done = true
                println "OK"
            } else {
                println "Invalid email"
            }
        } else {
            print "Command invalid"
        }
    }
}

// Body of email - message
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

if (!quit) {
    println "Sending email..."
    println "from: " + mailFrom
    println "to: " + mailTo
    print body
}