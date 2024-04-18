package majorityElement

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MajorityElementTest : FunSpec({

    test("majorityElement") {
        val res = MajorityElement().majorityElement(intArrayOf(3, 3, 4))
        res shouldBe 3
    }
})
