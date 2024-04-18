package removeElement

class RemoveElement {
    fun removeElement(nums: IntArray, value: Int): Int {
        var deleted = 0
        var iter = 0
        while (iter < nums.size - deleted) {
            val el = nums[iter]
            if (el == value) {
                deleted++
                for (j in iter..<nums.size - 1) {
                    val temp = nums[j + 1]
                    nums[j + 1] = el
                    nums[j] = temp
                }
            } else {
                iter++
            }
        }
        return iter
    }
}