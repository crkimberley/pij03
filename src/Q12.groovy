/**
 * @author crkimberley on 04/08/2016.
 */
Scanner input = new Scanner(System.in)
println "Change calculator: enter total cost of purchase (as pounds.pence, eg. 3.50)"
int costInPence = input.nextDouble() * 100
println "Enter amount paid to buy it"
int paidInPence = input.nextDouble() * 100
int change = paidInPence - costInPence
        println "Change = £" + (int) (change / 100) + "." + change % 100
