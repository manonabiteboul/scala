  case class Pos(x: Int, y: Int)

object tester {
  val a=3+1
  println("Welcome to the Scala worksheet")
  
  val manon2 = true
   def terrainFunction2(tester:Int) : Int=>Boolean={ x=> if (x==tester) true
   																											else false}
   																											
  val manon = terrainFunction2(3)(3)
  
  
 def example =  Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'))

  def terrainFunction(levelVector: Vector[Vector[Char]]): (Int, Int) => Boolean = {(a,b)=>
  																						if (a> levelVector.length) false
  																						else if (b>levelVector(0).length) false
  																						else if ((levelVector(a))(b) =='o' || (levelVector(a))(b) =='S' || (levelVector(a))(b) =='T') true
  																						else false
  	}
  	
  
 val test = terrainFunction(example)(0,1)
example.indexWhere(x => x.contains('S'))
	//p.x

}
