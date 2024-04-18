package mergeSortedArrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.collections.shouldContainInOrder

class MergeSortedArraysTest : FunSpec({

    test("merge") {
        val arr = intArrayOf(4, 5, 6, 0, 0, 0)
        MergeSortedArrays().merge(
            arr,
            3,
            mutableListOf(1, 2, 3).toIntArray(),
            3
        )
        arr.toList().shouldContainInOrder(1, 2, 3, 4, 5, 6)
    }
})
