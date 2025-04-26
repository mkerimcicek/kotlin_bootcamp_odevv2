package com.example.kotlinodev2.odev2

class KotlinOdev {
    fun dereceDonusumu(cderece: Int) : Double{
        val f = cderece * 1.8 + 32
        return f
    }

    fun cevreHesapla(kenar1: Int, kenar2: Int){
        val cevre = kenar1*kenar2
        println(cevre)
    }

    fun faktoryelHesapla(fak: Int) : Int{
        var faktoryel = 1
        for(i in fak downTo 1 step 1){
            faktoryel *= i
        }
        return faktoryel
    }

    fun aHarfiBul(kelime: String){
        var count = 0
        for(i in kelime){
            if(i == 'a' || i == 'A'){
                count += 1
            }
        }
        println(count)
    }

    fun icAcilarToplami(kenarSayisi: Int): Int{
        var icAci = (kenarSayisi-2)*180
        return icAci
    }

    fun maasHesapla(gunSayisi: Int): Int{ //25
        val maxSaat = 160
        if(gunSayisi > 31){
            println("Lutfen 0-31 araliginda bir deger giriniz.")
            return 0
        }else{
            if(gunSayisi*8 < 161){
                var maas = gunSayisi*8*10
                return maas
            }else{
                var mesaiSaati = gunSayisi * 8 - 160
                var toplamMaas = 160 * 10 + mesaiSaati * 20

                return toplamMaas
            }
        }
    }

    fun kotaUcreti(kota: Int): Int{
        if(kota<=50){
            return 100
        }else{
            val asimMiktari = kota - 50
            val ucret = 100 + asimMiktari * 4

            return ucret
        }
    }
}