package com.example.kotlinodev2.odev2

fun main() {
    val derece = KotlinOdev()

    val gelenSonuc = derece.dereceDonusumu(35)
    println(gelenSonuc)

    derece.cevreHesapla(8,9)

    val faktoryeldenGelenSonuc = derece.faktoryelHesapla(5)
    println(faktoryeldenGelenSonuc)

    derece.aHarfiBul("Kasım Adalan")

    val icAci = derece.icAcilarToplami(4)
    println(icAci)

    val maas = derece.maasHesapla(21)
    println(maas)

    val internet = derece.kotaUcreti(53)
    println(internet)
}