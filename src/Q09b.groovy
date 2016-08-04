/**
 * Created by crk on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
String searchHistory = ""
boolean newSearch = true
println "Enter some text and find out how many times a specified letter appears"
println "Enter text"
String text = input.nextLine()
while (newSearch) {
    print "Specify a letter to search for: "
    char letter = input.next()
    for (int s=0;s<searchHistory.length();s++) {
        if (searchHistory.charAt(s) == letter) {
            newSearch = false
            println "Repeat search - program will terminate"
            break
        }
    }
    if (newSearch) {
        searchHistory = searchHistory + letter
        int letterCount = 0
        for (int i=0;i<text.length();i++) {
            if (text.charAt(i) == letter) {
                letterCount++
            }
        }
        println "There were " + letterCount + " '" + letter + "'s"
    }
}