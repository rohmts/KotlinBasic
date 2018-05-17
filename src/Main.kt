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

    val person = Person("Rohmts", 23, true);
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

    //explicit conversion
    val a = "25"
    val b = "25"
    val result = a.toInt() + b.toInt()
    println("${result}")

    //implicit conversion
    val c = 1000
    println("c data type : ${c.javaClass.kotlin.qualifiedName}")

    //save conversion its mean put data from smaller data storage area into large data storage area
    val d: Int = 10
    val e: Long = d.toLong()
    println("e data type : ${e.javaClass.kotlin.qualifiedName}")

    //unsave conversion
    val f: Float = 100.1f
    val g: Int = f.toInt()
    println("e data type : ${g.javaClass.kotlin.qualifiedName}")
    println("e value : ${g}") //lost 0.1

    var h = -7
    h = h.unaryPlus() //a = + a
    println("h value : ${h}")
    h = h.unaryMinus()
    println("h value : ${h}")

    var k = 2
    println("Case 1 : ${k++}")
    println("Case 2 : ${++k}")

    val l = 3
    val resultMod = k.rem(l)
    println("${resultMod}")

    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    if (5 in array) println("5 in array")
    if (17 in array) println("17 not in array")

    k+=l
    println("${k}")

    println("input/output")
    print("Please enter your name : ")
    val name = readLine()
    print("Are u women? ")
    val gender = readLine()
    println("Your name is ${name}")
    if (gender?.toBoolean() == true)
        println("yes! Im a women")
    else
        println("Im not a women")
    print("Salary from Android Developer : Rp.")
    var salaryAndroid = readLine()?.toInt()
    print("Salary from iOS Developer : Rp.")
    var salaryIos = readLine()?.toInt()
    println("Total salary : Rp.${salaryAndroid?.plus(salaryIos!!)}")

}