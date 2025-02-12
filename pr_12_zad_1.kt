import java.lang.Exception
import java.lang.Math.*

fun main(){
    try {
        println("Введите а:")
        val a = readln().toDouble()
        println("Введите b:")
        val b = readln().toDouble()
        println("Введите c:")
        val c = readln().toDouble()
        val p = (a+b+c)/2
        val r = Math.sqrt(((p-a)*(p-b)*(p-c))/p)
        val R = a*b*c/4*Math.sqrt(p*(p-a)*(p-b)*(p-c))
        println("Радиус вписанной окружности: ")
        println(round(r))
        println("Радиус описанной окружности: ")
        println(round(R))
    }
    catch (a:Exception){
        println("Неверный ввод!")
    }
}