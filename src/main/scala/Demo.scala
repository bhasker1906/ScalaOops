object Demo {
var speed:Int=400;
def hello()={println("Welcome TO Class"+speed)}
}
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}