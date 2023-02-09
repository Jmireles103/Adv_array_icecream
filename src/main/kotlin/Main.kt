fun main() {
    val sSupplies = arrayOf("Ice cream","Cones","Bowls","Napkins","Spoons")
    var quantity = arrayOf("20 tubs","65 cones","75 bowls","115 napkins","150 Spoons")
    val i = 1

    var combArray = arrayOf<Array<String>>()

    combArray+= sSupplies
    combArray+= quantity

    val rowcount = combArray[0].size-1

    for (i in 0..rowcount)
    val item = combArray[0][i]
    val qty = combArray[1][i]
    println("In Combined array: $item has $qty left in on hand.")

}