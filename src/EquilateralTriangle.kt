class EquilateralTriangle(val a: Int, val b: Int, val c: Int) {
    val isEquilateralTriangle: Boolean
        get() = a == b && b == c

}