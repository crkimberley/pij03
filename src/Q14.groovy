/**
 * @author crkimberley on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
print "Palindrome creator - enter some text: "
text = input.nextLine()
for (int i=text.length()-1;i>=0;i--) {
    text = text + text.charAt(i)
}
println text