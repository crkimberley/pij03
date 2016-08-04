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

println "NOTES"
println "No. of £50 notes = " + change50Pounds
println "No. of £20 notes = " + change20Pounds
println "No. of £10 notes = " + change10Pounds
println "No. of £5 notes = " + change5Pounds
println "COINS"
println "No. of £2 coins = " + change2Pounds
println "No. of £1 coins = " + changePounds
println "No. of 50p coins = " + change50Pence
println "No. of 20p coins = " + change20Pence
println "No. of 10p coins = " + change10Pence
println "No. of 5p coins = " + change5Pence
println "No. of 2p coins = " + change2Pence
println "No. of 1p coins = " + changePence