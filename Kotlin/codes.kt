//fun main(args: Array<String>): Unit {
println("Helloworld")
println("hello kotlin")
println(20-54)
print(30.0/7)

 var variableName = "value"
println(variableName)

var varName: String//Mutable String
varName = "Home"
varName = "Student"
println(varName)

val Myname: Int
Myname = 5
println(Myname)



fun main(args: Array<String>): Unit {
    var objectname = classname()
    objectname.name="Happy birthday"
    objectname.dis(objectname.name)
    }
    class classname() {
    var name: String = " "

    fun dis(name: String) {
        println(name)
    }
}



fun main(args: Array<String>): Unit {
    var objectname = classname()
    objectname.name = "Happy birthday"
    println("wish you a very ${objectname.name}")
}

    class classname() {
        var name: String = " "
    }









fun main(args: Array<String>): Unit {
  val a = 20
    val b = 20
println("the multiplication $a and $b is ${a * b}")
}

fun main(args: Array<String>): Unit {
    var a = 7
var b = 8
var value: Int = if (a>b) a else b
println("The greatest number is $value")
}



fun main(args: Array<String>): Unit {
  val c = 80
var varname: String = when (c){in 10..50 -> "c is in between 10 to 50"
                                in 51..100 -> "c is between 51 to 100"
                                else -> "c is above 100"}
println(varname)
}




fun main(args: Array<String>): Unit {
    for (i in 1..20) {
        if (i % 2 == 0)
            println(i)
    }
  }


fun main(args: Array<String>): Unit {
    var i = 1
    while (i in 0..50) {
        if (i % 5 == 0)
            println(i)
        i++
    }
}




fun main(args: Array<String>): Unit {
    var i = 11
    do {
        if (i % 2 == 0)
            println(i)
        i--
    } while (i >= 0)
}




fun main(args: Array<String>): Unit {
    var i = 11
    do {
            println(i)
        i--
    }while (i >=0)
}






fun main(args: Array<String>): Unit {
      for (i in 5 downTo 3)  //5 4 3
          for (j in 1..3)   // 1 2 3
          println("$i $j")  //51 52 53 41 42 43 31 32 32

}


fun main(args: Array<String>): Unit {
    for (i in 5 downTo 3) {  //5 4 3
        for (j in 1..3) {  // 1 2 3
            println("$i $j")//51 52 53 41 42 43 31 32 32
            if (i == 4 && j == 1)  //41
                break            // breaks the j loop of 42 43 and start with 5
        }
    }
}



fun main(args: Array<String>): Unit {
    thisloop@ for (i in 5 downTo 3) {  //5 4 3
        for (j in 1..3) {  // 1 2 3
            println("$i $j")//51 52 53 41 42 43 31 32 32
            if (i == 4 && j == 1)  //41
                break@thisloop            // breaks the i loop of 42 43 33 32 31
        }
    }
}




fun main(args: Array<String>): Unit {
    thisloop@ for (i in 5 downTo 3) {  //5 4 3
        for (j in 1..3) {
            if (i == 4 && j == 1)  //41 42 43 is skipped
                continue@thisloop
            println("$i $j")
        }
    }
}


//Interoperability kotlin in java check kotlinFile and JavaFile also my2kotlin and my2java
//fun main(args: Array<String>): Unit {

      var result = ma(4, 9)
      println("the greatest is $result")
  }

      fun ma(a:Int,b:Int): Int =
          if (a>b) {
              a
          }else {
              b
              98



fun main(args: Array<String>){
    println("This is kotlin main method")
}
fun happy(a: Int, b: Int):Int{
    return a - b

 
//In Kotlin there are named parameters
fun main(args: Array<String>) {

   println(Volume(2, 5, 7))
   println(Volume(h = 8, b = 10,l = 10 ))
    println(Volume(b = 50, l = 20))

}

fun Volume(l: Int, b: Int, h: Int = 10): Int{
    println("length is $l ")
    println("breadth is $b")
    println("height is $h")
    return l*b*h

 // Extension Funtion
//own defined class

}
fun main(args: Array<String>){
  var countryobj = Country()
    println("${countryobj.isRich(1)}")
    println("${countryobj.which("Austria")}")
}
class Country{
    fun isRich(economy: Int):Boolean{
        return (economy >5)
    }
}
fun Country.which(name: String):String{
    return name
}

// Practical usage of extension function
//predefined class

fun main (args: Array<String>){
    val a: Int = 10
    val b: Int = 20
    val c: Int = 76
    var d: Int = 80

    println(d.additionofsquareofno(c,b,a))
}

fun Int.additionofsquareofno(c: Int, b: Int, a: Int ): Int{
    return this*this + a*a + b*b + c*c

}



fun main (args: Array<String>) {


    var x = 2
    var y = 3

    println(y.additionofsquareofno(x))

}

fun Int.additionofsquareofno(x: Int): Int{
    var sum = 0
    var a = 0

    for (i in x..this) {
        a = i * i
        sum = sum + a


    }
     return sum
}




// infix Function

fun main (args: Array<String>){ // it works only with one parameter
    var b= 10.0f
    var a = 5.0f
    println("Your Answer is: ${b DivideBy a}") // can be access without dot and bracket
}
 infix fun Float.DivideBy(a: Float): Float {  // Here Float is predefined class
  return this/a
}




//Tailrec Functions: prevents the stack overflow


import java.math.BigInteger
fun main(args: Array<String>){
    println("${getFibonacciNo(10000, BigInteger("0"),BigInteger("1"))}")
}
tailrec fun getFibonacciNo(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n==0)
        return a
    else
        return getFibonacciNo(n-1, a+b, a)
}



//Primary Constructor
fun main(args: Array<String>){
    var student = Student("Janhavi")
    student.name = "Hello"
    println("${student.name}")
}
class Student(var name: String){ //name is now used as property as well as parameters

    init{                                 //Janhavi
        println("$name")                  //Hello
    }

}

fun main(args: Array<String>){
    var student = Student("Janhavi")    //after the object is created it enters into init block first
    println("${student.name}")

}
class Student(name: String){          //this keyword is used to specify property of class
    var nam = "Hello"
                                      // Output :
                                      //Janhavi
                                      //Janhavi
    init{
        this.nam = name
        println("$name")
    }
}
fun main(args: Array<String>){
    var student = Student("Janhavi",5)    //after the object is created it enters to second constructor
    println("${student.nam}")
    println("${student.id}")

}
class Student(name: String){          //this keyword is used to specify property of class
    var nam = "Hello"
    var id   = 1

    init{
        println("$nam")
        println("$name")
        println("$id")
    }
  constructor(F: String, id: Int): this(F){
      this.id = id
      println("${this.id}")
      this.id = 6
      this.nam = "World"
      println("${this.id}")
      var id = 2
      println("$id")
      this.id = id
      println("${this.id}")
      println("$id")
  }

}

fun main(args: Array<String>){
  val dog = Dog()
    dog.breed = "labra"
    dog.color = "brown"
    dog.bark()
    dog.eat()
    println(dog.breed)
    println(dog.color)

    val cat = Cat()
    cat.age = 7
    cat.color = "black"
    cat.meow()
    cat.eat()
    println(cat.age)
    println(cat.color)


    val animal = Animals()
     println(animal.color)
     animal.eat()

}

open class Animals() {          //open keyword is required
    var color = "white"
    fun eat(){
        println("eat")
    }
}

class Cat : Animals(){
    var age = -1
    fun meow(){
        println("meow")
    }
}
class Dog: Animals(){
    var breed = ""
    fun bark(){
        println("bark")
    }
}


//Method Overriding and property Overriding

fun main(args: Array<String>){
    var dog = Dog()
    dog.eat()
    println(dog.color)


    var cat = Cat()
    cat.eat()
    println(cat.color)

    var animal = Animals()
    animal.eat()
    println(animal.color)


}

open class Animals() {          //open keyword is required
    open var color: String = "white"
     open fun eat(){
        println("Animal eating")
    }
}

class Cat : Animals(){

    var age = -1
    override var color:String = "black"
    fun meow(){
        println("meow")
    }
    override fun eat() {
        println("Cat is eating")
    }
}
class Dog: Animals() {
    var breed = ""
    fun bark() {
        println("bark")
    }

    override fun eat() {
        println("Dog is eating")
    }
}



// Using super keyword

fun main(args: Array<String>){
    var dog = Dog()
    dog.eat()
    println(dog.color)


    var cat = Cat()
    cat.eat()
    println(cat.color)



}

open class Animals() {          //open keyword is required
    open var color: String = "white"
    open fun eat(){
        println("Animal eating")
    }
}

class Cat : Animals() {

    var age = -1
    override var color: String = "black"
    fun meow(){
        println("meow")
    }

    override fun eat() {
        super<Animals>.eat()
        println("Cat is eating")
    }
}
class Dog: Animals() {
    var breed = ""
    fun bark() {
        println("bark")
    }

    override fun eat() {
        super.eat()
        println("Dog is eating")
    }
}


// Primary constructor

fun main(args: Array<String>){
    var dog = Dog("Black","Pug")
}
open class Animal(var color: String){
    init{
        println("From Animal: $color")
    }
}
class Dog(color: String,var breed: String):Animal(color){
    init {
        println("From Dog:$color and $breed")
    }
}

//Secondary Constructor

fun main(args: Array<String>){
    var dog = Dog("Black", "Pug")
}
open class Animal {
    constructor(color: String){
        println("From Animal: $color")
    }
}
class Dog: Animal{
    constructor(color:String, breed: String):super(color){
        println("From Dog:$color and $breed")
    }

}



fun main(args: Array<String>){
    var dog = Dog(eat = "Milk", "Black",breed =  "Pug")
}
open class Animal {
    var color: String = ""
    var eat: String = ""
     constructor(eat: String,color: String){
        this.color = color
         this.eat = eat
             println("From Animal: $color and $eat")

    }
}
class Dog: Animal{
    constructor(eat: String,color:String, breed: String):super(eat, color){
            println("From Dog:$color and $breed and  $eat")
    }
}


//Visibility Modifiers

fun main(args: Array<String>){

}

open class Person{
    public val a = 1
    internal val b = 2
    private val c = 3
    protected val d = 4
}
class Indian: Person(){
    fun test(){
        println(c)    //c cannot be accessible it is invisible
        println(d)
        println(b)
        println(a)
    }
}

class NonIndian {
    fun test(){
        var person = Person()
        println(person.d)    //d protected cannot be accessible in other class
        println(person.c)    //c(private),d(protected) cannot be accessible it is invisible
        println(person.b)
        println(person.a)
    }
}



//Abstract Functions


fun main(args: Array<String>){
    // cannot creat instance of abstract class
}
abstract class Person{
    abstract var a: String  // cannot be initialized since abstract also 'open' by default
    abstract fun add()      // should not contain body also 'open' by default
    open fun subtract(){}   // should contain body , can be override
    fun multiply(){}        // public and final so cannnot be override
}
class Indian: Person(){
    override var a: String = "" // have to initialized


    override fun add() {        // have to contain body

    }
}

//Interface


fun main(args: Array<String>){
    // cannot creat instance of interface class
    var button = Button()
    println(button.scroll)
    button.onClick()
    button.onTouch()
}
interface Listener{
    var scroll: String // abstract by default
    fun onTouch() //abstract
    fun onClick(){
        println("super method")
        // open by default
    }
}
class Button: Listener{
    override var scroll : String = "upward"
    override fun onTouch() {
        println("onTouch")
    }

    override fun onClick() {
        super.onClick()
        println("subclass method")
    }

}

//two interfaces of a subclass using super keyword

fun main(args: Array<String>){
    // cannot creat instance of interface class
    var button = Button()
    println(button.scroll)
    button.onClick()
    button.onTouch()
}
interface Listener1{
    var scroll: String // abstract by default
    fun onTouch(){
        println("super touch method from 1")
    }
    fun onClick(){
        println("super click method from 1")
        // open by default
    }
}
interface Listener2{
    var scroll: String // abstract by default
    fun onTouch() //abstract
    fun onClick(){
        println("super click method from 2")
        // open by default
    }

}
class Button: Listener1,Listener2{
    override var scroll : String = "upward"
    override fun onTouch() {
        super.onTouch()
        println("subclass onTouch method")
    }

    override fun onClick() {
        super<Listener1>.onClick()
        super<Listener2>.onClick()
        println("subclass onClick method")
    }


}


//Data Class
fun main(args: Array<String>){
    var objectName = classname("Rohan", 3)
    println(objectName)             // classname@7cca494b
}
 class  classname(var name: String, var id: Int)
//**********************************************************

fun main(args: Array<String>){
    var objectName1 = classname("Rohan", 3)
    println(objectName1)             // classname(name=Rohan, id=3) using data class

}
data class  classname(var name: String, var id: Int)

//****************************************



fun main(args: Array<String>){
    var objectName1 = classname("Rohan", 3)
    println(objectName1)             // classname@7cca494b
                                     // classname@7ba4f24f
                                     // False
    var objectName2 = classname("Rohan", 3)
    println(objectName2)
    if (objectName1==objectName2)
        println("True")
    else
        println("False")
}
class  classname(var name: String, var id: Int)



fun main(args: Array<String>){
    var objectName1 = classname("Rohan", 3)
    println(objectName1)
                                                     // classname(name=Rohan, id=3)
    var objectName2 = classname("Rohan", 3) // classname(name=Rohan, id=3)
    println(objectName2)                             // True
    if (objectName1==objectName2)
        println("True")
    else
        println("False")
}
data class  classname(var name: String, var id: Int)




fun main(args: Array<String>){
    var objectName1 = classname("Rohan", 3)
    println(objectName1)
    // classname(name=Rohan, id=3)
    var objectName2 = classname("Rohan", 3) // classname(name=Rohan, id=3)
    println(objectName2)                             // True
    if (objectName1==objectName2)
        println("True")
    else
        println("False")

    var objectName3 = objectName1.copy(id = 8)
    println(objectName3)

    var objectName4 = objectName1.copy(name = "Sam")
    println(objectName4)

    var objectName5 = objectName1.copy(name = "Sam", id = 10)
    println(objectName5)
}
data class  classname(var name: String, var id: Int)

// Object Declaration (Behaving as Static variables and static method)


fun main(args: Array<String>){
    println(AsStatic.staticVar)
    AsStatic.staticMethod()
    println(AsStatic.method("Good"))
}
open class superclass{
    open fun method(f: String):String{
        println("superclass method")
        return f
    }
}
object AsStatic: superclass(){
    var staticVar: String = "name" // behave as static var
    fun staticMethod(){
        println("address")         // behave as static method
    }

    override fun method(f: String): String {
        super.method(f)
        println("ovverride method")
        return f + f
    }
}
*/
// Companion Objects (Actually the static variables and static method)

fun main(args: Array<String>){
    println(classname.staticVar)
    println(classname.method("Hello"))
    classname.staticMethod()
}
 class classname{
    companion object {
         var staticVar: String = "name" // behave as static var
         fun staticMethod(){
             println("address")         // behave as static method
         }

          fun method(f: String): String {
             println("ovverride method")
             return f + f
         }
     }
}
