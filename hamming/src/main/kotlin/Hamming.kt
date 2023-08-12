object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        require(leftStrand.length == rightStrand.length) { "left and right strands must be of equal length" }
        var result = 0
        for (i in leftStrand.indices) {
            if (leftStrand[i] != rightStrand[i]) {
                result++
            }
        }
        return result
    }
}
