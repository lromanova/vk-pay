fun main() {
    val amount: Int = 173000;

    val peny = amount * 0.0075
    val result = if(peny < 35) 35 else kotlin.math.round(peny)
    println("Комиссия за перевод составит $result копеек")
}