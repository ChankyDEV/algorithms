package removeDuplicatesFromSortedArray

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RemoveDuplicatesFromSortedArrayTest : FunSpec({
    val arr = intArrayOf(0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4)

    test("removeThirdDuplicate") {
        val result = RemoveDuplicatesFromSortedArray().removeThirdDuplicate(arr)
        result shouldBe 9
    }

    test("removeAllDuplicate") {
        val result = RemoveDuplicatesFromSortedArray().removeAllDuplicates(arr)
        result shouldBe 5
    }
})
