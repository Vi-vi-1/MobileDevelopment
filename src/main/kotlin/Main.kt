@file:Suppress("UNUSED_PARAMETER")

fun main(args: Array<String>) {

    // Практическая номер 2
    /* Задание 1
    Проверка соответствует ли ожидаемый тип Int результату  */
    val age1 = 42.toDouble();
    val age2 = 21.toDouble();
    // Константы определены верно (прим.Задание3)

    /* Задание 2
     Вычисление константы, ожидается тип Double при проверке */
    val avg1 = (age1 + age2)/2;
    println();
    println(avg1);
    /* Ожидаемое не совпадает с результатом.
    Компилятор автоматически определяет тип Int по отношению к этой константе */

    /* Задание 3
   Исправлена ошибка при определении типов. Константам age1 и age2 присвоен тип Double.
   Способ изменения самих констант.
   Первый пример с явным преобразованием с помощью другой константы не получился
   Из-за того что типы констант для вычисления изменены,
   константа avg1 выводит верный результат в формате десятичной дроби */

    /* Задание 4
    Создала константы с именем и фамилией */
    val firstName : String = "Виктория";
    val lastName : String = "Тарасова";

    /* Задание 5
    Вывела через пробел значения firstName и lastName */
    val fullName : String = firstName + " " + lastName;
    println();
    println(fullName);

    /* Задание 6
    Создала в константе строковый шаблон , и вывела её */
    val myDetails : String = "Привет, меня зовут $fullName.";
    println();
    println (myDetails);

    /* Задание 7
    При помощи типа Triple создала константу и внесла три числа */
    val  dates = Triple (10,10,2022);
    println();
    println (dates);

    /* Задание 8
    Извлекла из Triple 3 константы чтобы в дальнейшем их использовать */
    val day= dates.first
    val month = dates.second
    val year = dates.third

    /* Задание 9
    Вывела значение месяца и года в отдельные константы.
    Если неправильно поняла задание то вариант вывода на консоль
    println();
    println (month);
    println();
    println (year);
    */
    val month1 : Int = month-3;
    val year1 : Int = year;

    /* Задание 10
    Создала новую константу типа Pair для измененного месяца и того же года*/
    val pairs = Pair (month1, year1) ;
    println();
    println (pairs);

}