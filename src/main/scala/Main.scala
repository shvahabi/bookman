import org.scalajs.dom.document
import com.github.shvahabi.bookman.helloworld

@main def hello: Unit = 
  helloworld.appendPar(document.body, msg)  

def msg = "Hello world!"
