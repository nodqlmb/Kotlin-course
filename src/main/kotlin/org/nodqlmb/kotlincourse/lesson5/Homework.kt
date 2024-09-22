package org.nodqlmb.kotlincourse.lesson5

//Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной
//интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
//
//Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания
//пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен,
// использовать стандартное значение 0.5.
fun main(){
    printSoundIntensity(100.0, null)
    printSoundIntensity(100.0, 0.4)

    PrintShippingCost(shipping = null)
    PrintShippingCost(shipping = 60.0)

    PrintAtmosphericPressureReport(atmosphericPressure = 760)
    PrintAtmosphericPressureReport(atmosphericPressure = null)


}
fun printSoundIntensity(soundIntensity: Double, DampingCoeffitient: Double?) {
    val SoundIntensivity = (soundIntensity * (DampingCoeffitient ?: 0.5))
    println(SoundIntensivity)

}
//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5%
//от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//
//Задача: Рассчитать полную стоимость доставки.
fun PrintShippingCost(insurance: Double = 0.5, shipping: Double?) {
    val cost = (((insurance / 100.0) * (shipping ?: 50.0)) + (shipping ?: 50.0))
    println(cost)
}

//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
//которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
//
//Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

fun PrintAtmosphericPressureReport(atmosphericPressure: Any?) {
    val atmosphericPressure = (atmosphericPressure ?: "Ошибка")
    println(atmosphericPressure)
}
