package etajer.cashier.objects

class SellUnitTests {
}

val CoffeeFacto = object : SellUnit {
    override val name: String = "Coffee Facto"
    override val qty: Int = 1
    override val price: Double = 180.00
}

val Milkospray500g = object : SellUnit {
    override val name: String = "Milkospray 500g"
    override val qty: Int = 1
    override val price: Double = 370.00
}

val Milkospray1Kg = object : SellUnit {
    override val name: String = "Milkospray 1Kg"
    override val qty: Int = 1
    override val price: Double = 650.00
}

val WaterBottle = object : SellUnit {
    override val name: String = "Watter Ifri"
    override val qty: Int = 1
    override val price: Double = 35.00
}

val WaterFardo = object : SellUnit {
    val productName = "Watter Ifri"
    val unitName = "Fardo"

    override val name: String = "$productName ($unitName)"
    override val qty: Int = 6
    override val price: Double = 180.00
}