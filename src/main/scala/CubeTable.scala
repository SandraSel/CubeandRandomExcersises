import scala.io.StdIn.readLine

object CubeTable extends App {
  //TO DO write a program that takes user input for starting and end values
  //then saves cubes of those values in a Seq data type and then prints the cubes out
  val begVal = readLine("What is the starting value?").toInt
  println(s"Will print cubes starting with cube for $begVal")

  val endVal = readLine("What is the end value?").toInt
  println(s"Will print cubes ending with cube for $endVal")

  val cubeSeq = begVal to endVal
  cubeSeq.foreach(el => println(el * el * el))
}
