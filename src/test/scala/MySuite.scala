import org.scalajs.dom.document
import com.github.shvahabi.bookman.helloworld

class MySuite extends munit.FunSuite {
  test("example test") {
    helloworld.appendPar(document.body, "Hello world!")
    val obtained = document.querySelector("p").textContent
    val expected = "Hello world!"
    assertEquals(obtained, expected)
  }
}
