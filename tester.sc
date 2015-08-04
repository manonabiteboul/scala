

object tester {
  val a=3+1                                       //> a  : Int = 4
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val manon2 = true                               //> manon2  : Boolean = true
   def terrainFunction2(tester:Int) : Int=>Boolean={ x=> if (x==tester) true
   																											else false}
                                                  //> terrainFunction2: (tester: Int)Int => Boolean
   																											
  val manon = terrainFunction2(3)(3)              //> manon  : Boolean = true
  
  
 def example =  Vector(Vector('o', 'T'), Vector('o', 'o'), Vector('o', 'S'))
                                                  //> example: => scala.collection.immutable.Vector[scala.collection.immutable.Vec
                                                  //| tor[Char]]

  def terrainFunction(levelVector: Vector[Vector[Char]]): (Int, Int) => Boolean = {(a,b)=>
  																						if (a> levelVector.length) false
  																						else if (b>levelVector(0).length) false
  																						else if ((levelVector(a))(b) =='o' || (levelVector(a))(b) =='S' || (levelVector(a))(b) =='T') true
  																						else false
  	}                                         //> terrainFunction: (levelVector: Vector[Vector[Char]])(Int, Int) => Boolean
  	
  
 val test = terrainFunction(example)(0,1)         //> test  : Boolean = true
val index = example.indexWhere(x => x.contains('S'))
                                                  //> index  : Int = 2
val answer = (index, example(index).indexOf('S')) //> answer  : (Int, Int) = (2,1)
	//p.x

}