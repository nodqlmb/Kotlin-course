package org.nodqlmb.org.nodqlmb.kotlincourse.lesson3

//Название мероприятия:

val Name: String = "Hackathon"

//Дата проведения:

const val Date: String = "31.12.2024"

//Место проведения:

var Location: String = "Фермское шоссе,36"

//Подробный бюджет мероприятия

var totalCost: Int = 666666

var equipmentCost: Int = 16

var cateringCost: Int = 50

var otherCost: Int = 666600

//Количество участников:

var Participants: Int = 13

//Длительность хакатона:

var hackathonDuration: String = "2 дня"

//Контактная информация и условия соглашений с поставщиками пищи,
// оборудования и других услуг:

private val suppliersContact: String = "666-66-66, всё за 66"

//Текущее состояние хакатона (статус):

var status: String = "не начат"

//Список спонсоров:

val sponsors: String = "Коки-кола, Макшнакенс, Абибас"

//Бюджет мероприятия?

private var budget: Int = 6666666

//Текущий уровень доступа к интернету:

var internetOn: Int = 0

//Информация о транспортировке оборудования, распределении ресурсов и
// координации между различными командами поддержки:

private val Logistics: String = "Я апшался"

//Количество команд:

var Teams: Int = 3

//Перечень задач:

var Tasks: String = "1. Пресс качат" + "2. Бегит" + "3. Анжуманя"

//План эвакуации:

val evacuationPlan: String = "ссылка на картинку"

//Список доступного оборудования:

val equipmentList: String = "Компьютер, проектор, лазерная указка"

//Список свободного оборудования:

var equipmentFree: String = "Лазерная указка"

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

val LunchSchedule: String by lazy {
    ""
}

//План мероприятий на случай сбоев:

var planB: String = "Выгнать Олега"

//Список экспертов и жюри:

var juryList: String = "Олег, Олег2, Пафнутий"

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

private val lazyFeedbackCheck: String by lazy {
    "опросник"
}

//Политика конфиденциальности:

var privacyPolicy: String = "Первое правило хакатона"

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем:

private val lazyFeedback: String by lazy {
    "Крысинг"
}

//Текущая температура в помещении:

var temperatureIndoor: Int = 23

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения:
//творческий подход
var monitoringNetwork: String = ""
    get() = field
    set(value) {
        if (value == "Фунциклирует") field = "Работаем, братья"
        else field = "Не работаем, братья"
    }

//Уровень освещения:

var LightLevel: Int = 300

//Лог событий мероприятия

private var log: String = "то, сё"

//Доступность медицинской помощи:

var ambulance: Boolean = false

//Планы и процедуры для обеспечения безопасности мероприятия,
// включая планы эвакуации и протоколы чрезвычайных ситуаций:

private var safety: String = "Сохранять спокойствие" + evacuationPlan

//Регистрационный номер мероприятия:

val Regnumber: Int = 1234567890

//Максимально допустимый уровень шума в помещении хакатона:

val NoiseMax: Int = 55

//Индикатор превышения уровня шума в помещениях:
var NoiseLevel: Int = 0
    get() = field
    set(value) {
        if (value <= NoiseMax) field = value
        else field = 100
    }

//Формат мероприятия (зависит от геополитической обстановки):

var HackathonFormat: String = ""
    get() = field
    set(value) {
        if (value == "Повітряна тривога") field = "Хакатон проводится в подвале"
        else field = "Хакатон проводится согласно первоначальному плану"
    }

//Количество свободных мест для отдыха (например, кресел или диванов),
// сеттер валидирует, чтобы количество не было меньше нуля.


var availableSeats: Int = 0
    get() = field
    set(value) {
        if (value < 0) field = 0
        else field = 0
    }

//План взаимодействия с прессой:

val Press: String = "Не упоминаем Олега"

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода
// и сбор статистики прогона автоматизированных проверок:

var projectOne: String = "Пипи"

var projectTwo: String = "Пупу"


var ProjectsSummary: String = projectOne + projectTwo

//Статус получения всех необходимых разрешений:

var permissions: Boolean = true

//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию):

var ExclusiveAccess: Boolean = false

//Список партнеров мероприятия:

val partnerList: String = "Мама, Папа, Бабушка, Двоюродный Дед"

//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен
//после завершения мероприятия:

lateinit var FinalReport: String

//План распределения призов:

val PrizesDistirb: String = "1 - затащили, 2 - тащили, 3 - что-то делали"

//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам:

val emergencyСontacts: String = "112"

//Особые условия для участников с ограниченными возможностями:

val SpecialFeatures: String = "Пандус для Олег2"

//Общее настроение участников (определяется опросами):

val currentMood: String by lazy { "" }

//Подробный план хакатона, включающий время и содержание каждого сегмента,
// инициализируется непосредственно перед началом мероприятия.

lateinit var hackathonPlan: String

//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия:

lateinit var secretGuest: String

//Максимальное количество людей, которое может вместить место проведения:

val guestsMax: Int = 50

//Стандартное количество часов, отведенное каждой команде для работы над проектом:

var timeProjectOne: Int = 10

var timeProjectTwo: Int = 10

var timeProjectThree: Int = 40