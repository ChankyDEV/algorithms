package mergeSortedArrays

class MergeSortedArrays {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for ((index, value) in nums2.withIndex()) {
            nums1[index + m] = value
        }
        nums1.sort()
    }
}