package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var lengthB = b.length
        b.forEachIndexed { b1, charB ->
            a.toUpperCase().forEachIndexed { a1, charA -> if (a1 > b1 && charB == charA) lengthB-- }
        }
        return if (lengthB == 0) "YES" else "NO"
    }
}
