

object tester {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(29); 
  val a=3+1;System.out.println("""a  : Int = """ + $show(a ));$skip(44); 
  println("Welcome to the Scala worksheet");$skip(23); 
  
  val manon2 = true;System.out.println("""manon2  : Boolean = """ + $show(manon2 ));$skip(119); 
   def terrainFunction2(tester:Int) : Int=>Boolean={ x=> if (x==tester) true
   																											else false};System.out.println("""terrainFunction2: (tester: Int)Int => Boolean""");$skip(68); 
   																											
  val manon = terrainFunction2(3)(3);System.out.println("""manon  : Boolean = """ + $show(manon ));$skip(83); 
  
  
 def example =  Vector(Vector('o', 'T'), Vector('o', 'o'), Vector('o', 'S'));System.out.println("""example: => scala.collection.immutable.Vector[scala.collection.immutable.Vector[Char]]""");$skip(376); 

  def terrainFunction(levelVector: Vector[Vector[Char]]): (Int, Int) => Boolean = {(a,b)=>
  																						if (a> levelVector.length) false
  																						else if (b>levelVector(0).length) false
  																						else if ((levelVector(a))(b) =='o' || (levelVector(a))(b) =='S' || (levelVector(a))(b) =='T') true
  																						else false
  	};System.out.println("""terrainFunction: (levelVector: Vector[Vector[Char]])(Int, Int) => Boolean""");$skip(49); 
  	
  
 val test = terrainFunction(example)(0,1);System.out.println("""test  : Boolean = """ + $show(test ));$skip(53); 
val index = example.indexWhere(x => x.contains('S'));System.out.println("""index  : Int = """ + $show(index ));$skip(50); 
val answer = (index, example(index).indexOf('S'));System.out.println("""answer  : (Int, Int) = """ + $show(answer ))}
	//p.x

}
