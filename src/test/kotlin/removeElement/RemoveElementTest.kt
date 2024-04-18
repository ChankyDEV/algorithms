package removeElement

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class RemoveElementTest : ShouldSpec({

    should("removeElement") {
        val k = RemoveElement().removeElement(intArrayOf(3, 2, 2, 3), 3)
        k shouldBe 2
    }

    should("removeElement #2") {
        val k = RemoveElement().removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2)
        k shouldBe 5
    }
})
