object DefaultArgs extends App {
def fact(x:Int,sum:Int):Int={ if(x<=1) return sum else fact(x-1,sum*x)}
 println(fact(5,1))

def printmsg(x:String="Hai",name:String,va:Int)=println("Welcome to Default methods  "+x+name+va)
 println(printmsg(name="jj",va=500))
var i=0;
  var res=while(i<5){
i+=1
  }
  println(res)
  amstrongNum(153)
  def amstrongNum(num:Int)={
    var n=num/10;
    var result=0.0;
    var no=num;
    //no=no/10;
    //result = Math.pow(no%10, 3)
  //  println(n+"  "++"  "+result)
   while(no>0) {

     var rem=no%10;
     no=no/10;
      result += Math.pow(rem, 3)
    }
    println(n+"  "++"  "+result)

  }

}
