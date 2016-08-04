/**
 * @author crkimberley on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Change calculator: enter total cost of purchase (as pounds.pence, eg. 3.50)"
int costPence = input.nextDouble() * 100
println "Enter amount paid to buy it"
int paidPence = input.nextDouble() * 100
int change = paidPence - costPence
int changePounds = (int) (change / 100)
int changePence = change % 100
println "Change = £" + changePounds + "." + changePence

