
object Basics  extends  App {

  //print("Testing Basics")
  val writer = new Writer("Daniel", "RockTheJVM", 2018)
  println(writer.fullName)
  class Animal{
    val an_type="Cow"
  }
  trait Demo{

   // def sample():Int={2}
  }
  val obj=new Animal();
  println(obj.an_type)

  case class person(name:String, age:Int)

  val person1=person("Ram2",20)
  val person2=person("Ram",20)
  println(person1==person2)
  val person3=person1.copy(age =20)
  println(person3)
  /*class DemoTwo with Demo{
     def sample():Int={5}
  }*/

}
