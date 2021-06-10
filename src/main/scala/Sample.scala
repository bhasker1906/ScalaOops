
object Sample {

  def main(args:Array[String]) {
    /*println("Hello")
    println(addtion(5,4));
    val one=1;
    println(one)*/
    //person obj= new person();
    //Person obj=new Person()
    val obj=new Person("RAM","ERROL")
    //obj.printFullName
    var li1=Seq("1","2")
    var li2=Seq("A","B")

    var res=li1.zip(li2)
    var ff=res.map(f=>{
      f._1+f._2
          })
    println(ff)
   for(i <- 0 until 6) {
     println(i)
   }
    var i=0
    while(i>5){
      println(i)
      i+=1
    }

  }

  def addtion(a:Int,b:Int):Int= {
     a + b
  }



}
