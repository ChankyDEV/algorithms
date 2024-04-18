package removeDuplicatesFromSortedArray

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicatesAndAllowTwo(nums: IntArray): Int {
        var i = 2
        var duplicates = 0
        while (i < nums.size - duplicates) {
            if (nums[i - 1] == nums[i] && nums[i - 2] == nums[i]) {
                var k = i
                while (k < nums.size - 1) {
                    val temp = nums[k + 1]
                    nums[k + 1] = nums[k]
                    nums[k] = temp
                    k++
                }
                duplicates++
            } else {
                i++
            }
        }
        return nums.size - duplicates
    }

    fun removeDuplicatesV2(nums: IntArray): Int {
        var j = 1
        for (i in 1..<nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]
                j++
            }
        }
        return j
    }

    fun removeDuplicatesV3(nums: IntArray): Int {
        var j = 2
        for (i in 2..<nums.size) {
            val f = nums[i - 1]
            val s = nums[i - 2]
            if (nums[j] != f || nums[j] != s) {
                nums[j] = nums[i]
                j++
            }
        }
        return j
    }

    fun removeDuplicatesSteerable(nums: IntArray, allowance: Int): Int {
        var j = allowance
        for (i in allowance..<nums.size) {


            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]
                j++
            }
        }
        return j
    }
    // 1,1,1,2,2,3
    /*
    j = 2

    for i in 2 .. nums.size
        val f = nums[i-1]
        val s = nums[i-2]
        if(nums[j] != f || nums[j] != s)
            nums[j] = nums[i]
            j++


     */
}