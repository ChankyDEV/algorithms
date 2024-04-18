package removeDuplicatesFromSortedArray

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 1
        var duplicates = 0
        while (i < nums.size - duplicates) {
            if (nums[i - 1] == nums[i]) {
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
}