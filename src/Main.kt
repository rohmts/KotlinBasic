import Pojo.Person

//non explicit
var a = 100L
val b = 0.1F

//these variables is more easily to understand (explicit)
var aInt: Int = 10
var char: Char = 'c'
var someStrings = "Abc Def Ghi"
var longString = """
    Lorem ipsum dolor sit amet
    consectetur adipiscing elit
    sed do eiusmod tempor
    """
//array declare
var arrayNumber: IntArray = intArrayOf(1, 2, 3, 4, 5)
var arrayLong: LongArray = longArrayOf(1000L, 2000L, 30000L, 400L, 50000L)
var arrayDouble: DoubleArray = doubleArrayOf(0.1, 0.2, 0.3, 0.4, 0.5)
var arrayFloat: FloatArray = floatArrayOf(0.6f, 0.7f, 0.8f, 0.9f, 0.10f)

fun sum2Numbers(a: Int, b: Int): Int {
    if (a < 0)
        return a - b
    else
        return a + b
}

//simplify the above function, if consists of just a single expression (if)
fun simpleSum2Numbers(a: Int, b: Int): Int = if (a < 0) a - b else a + b

//main function
fun main(args: Array<String>) {
    println("Hello world!")
    println("Hi Rohmts")
    print("Sum 2 numbers : ${sum2Numbers(5, 5)}\n")
    println("Sum 2 numbers : ${simpleSum2Numbers(-5, 5)}")
    println("Variable a = $a")
    println("Variable b = $b")
    println("Variable aInteger = $aInt")
    println("Variable Character = $char")
    println("Variable strings = $someStrings")
    print("Variable longString = $longString")
    println("Variable tipe data array\nnumber => ${arrayNumber[1]}\nlong => ${arrayLong}\ndouble => ${arrayDouble}\nfloat => ${arrayFloat}")

    var person = Person("Rohmts", 23, true);
    println("Pojo.Person name : ${person.name}\n" +
            "Pojo.Person age : ${person.age}\n" +
            "Pojo.Person gender :${person.gender}")

    person.name = "Anna"
    person.age = 22
    person.gender = false

    println("Pojo.Person name : ${person.name}\n" +
            "Pojo.Person age : ${person.age}\n" +
            "Pojo.Person gender :${person.gender}")

    val equilateralTriangle = EquilateralTriangle(5, 5, 5)
    println("Is EquilateralTriangle : ${equilateralTriangle.isEquilateralTriangle}")

}