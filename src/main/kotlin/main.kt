fun main() {
    val amount: Int = (1..15000000).random()
    val min_peny: Int = 3500
    println("Сумма перевода $amount копеек")

    val peny = amount * 0.0075
    val result = if(peny < min_peny) min_peny else kotlin.math.round(peny)
    println("Комиссия за перевод составит $result копеек")
}