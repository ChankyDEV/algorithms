package removeDuplicatesFromSortedArray

import io.kotest.core.spec.style.FunSpec

class RemoveDuplicatesFromSortedArrayTest : FunSpec({

    test("removeDuplicates") {
        RemoveDuplicatesFromSortedArray().removeDuplicatesV2(intArrayOf(0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4))
    }
})
