package $organization$

package object $name$ {

  //  Define constants
  val hello = "Let's get started"
  
  // Define implicits
  implicit class ToUpper(s: String) {
    def toUpper: String = s.toUpperCase    
  }
  
  implicit class ToInt(b: Boolean) {
    def toInt = if(b) 1 else 0
  }
}


