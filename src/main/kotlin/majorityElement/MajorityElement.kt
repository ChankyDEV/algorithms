package majorityElement

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        val major: Int = (nums.size / 2) + 1
        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            val el = map[nums[i]]
            if (el != null) {
                map[nums[i]] = el + 1
                if (el + 1 == major) {
                    return nums[i]
                }
            } else {
                map[nums[i]] = 1
            }
        }
        return nums[0]
    }
}