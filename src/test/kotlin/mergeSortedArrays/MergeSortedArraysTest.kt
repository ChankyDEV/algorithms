package mergeSortedArrays

import io.kotest.core.spec.style.FunSpec

class MergeSortedArraysTest : FunSpec({

    test("merge") {
        val arr = mutableListOf(4, 5, 6, 0, 0, 0).toIntArray()
        MergeSortedArrays().merge(
            arr,
            3,
            mutableListOf(1, 2, 3).toIntArray(),
            3
        )
    }
})
