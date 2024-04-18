package mergeSortedArrays

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldContainInOrder

class MergeSortedArraysTest : ShouldSpec({

    lateinit var solution: MergeSortedArrays

    beforeTest {
        solution = MergeSortedArrays()
    }

    should("join two sorted arrays case #1") {
        val arr = intArrayOf(4, 5, 6, 0, 0, 0)
        solution.merge(arr, 3, intArrayOf(1, 2, 3), 3)
        arr.toList().shouldContainInOrder(1, 2, 3, 4, 5, 6)
    }

    should("join two sorted arrays case #2") {
        val arr = intArrayOf(1, 2, 3, 0, 0, 0)
        solution.merge(arr, 3, intArrayOf(2, 5, 6), 3)
        arr.toList().shouldContainInOrder(1, 2, 2, 3, 5, 6)
    }
})
