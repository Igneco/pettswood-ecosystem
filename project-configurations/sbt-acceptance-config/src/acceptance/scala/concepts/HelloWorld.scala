package concepts

import org.pettswood.{Result, Concept}

class HelloWorld extends Concept {
  protected def cell(text: String) = Result.given(text, "World")
}