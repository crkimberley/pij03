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

int change50Pounds = changePounds / 50
changePounds = changePounds - change50Pounds * 50
int change20Pounds = changePounds / 20
changePounds = changePounds - change20Pounds * 20
int change10Pounds = changePounds / 10
changePounds = changePounds - change10Pounds * 10
int change5Pounds = changePounds / 5
changePounds = changePounds - change5Pounds * 5
int change2Pounds = changePounds / 2
changePounds = changePounds - change2Pounds * 2

int change50Pence = changePence / 50
changePence = changePence - change50Pence * 50
int change20Pence = changePence / 20
changePence = changePence - change20Pence * 20
int change10Pence = changePence / 10
changePence = changePence - change10Pence * 10
int change5Pence = changePence / 5
changePence = changePence - change5Pence * 5
int change2Pence = changePence / 2
changePence = changePence - change2Pence * 2


println "change50Pounds = " + change50Pounds
println "change20Pounds = " + change20Pounds
println "change10Pounds = " + change10Pounds
println "change5Pounds = " + change5Pounds
println "change2Pounds = " + change2Pounds
println "changePounds = " + changePounds
println "change50Pence = " + change50Pence
println "change20Pence = " + change20Pence
println "change10Pence = " + change10Pence
println "change5Pence = " + change5Pence
println "change2Pence = " + change2Pence
println "changePence = " + changePence