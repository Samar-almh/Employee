fun main (args:Array<String>){
    //webDeveloper
    val web = webDeveloper("Samar",22,90000)
    web.website()

    //androidDeveloper :
    val android = androidDeveloper("Asma",32,70000)
    android.android()

    // The iOSDeveloper :
    val iOS = iosDevloper("Hanan",20,50000)
    iOS.iosapp()
}
open class Employee(name: String,age: Int,salary: Int){
    init{
        println("the name is $name, the age is $age, the salary is $salary ")
    }
}
class webDeveloper(name: String,age: Int,salary: Int) :Employee(name, age, salary){
    fun website(){
        println("I'm website developer")
    }
}
class androidDeveloper(name: String,age: Int,salary: Int) :Employee(name, age, salary){
    fun android(){
        println("I'm android app developer")
    }
}
class iosDevloper(name: String,age: Int,salary: Int):Employee(name, age, salary){
    fun iosapp(){
        println("I'm ios app developer")
    }
}