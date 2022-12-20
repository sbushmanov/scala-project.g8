package $package$

import org.scalatest.funspec.AnyFunSpec
import Functions._

class FunctionsTest extends AnyFunSpec {

  describe("toUpper") {

    it("returns true if toUpper works and false otherwise") {

      assert("HELLO", "hello".toUpper)

    }
  }
}

