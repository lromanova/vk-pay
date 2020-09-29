fun main() {
    val amount: Int = (1..15000000).random()
    println("Сумма перевода $amount копеек")

    val peny = amount * 0.0075
    val result = if(peny < 35) 35 else kotlin.math.round(peny)
    println("Комиссия за перевод составит $result копеек")
}