object RandomNums extends App {
  //TODO generate a sequence of 100 random 2 dice throws so and then calculate the average and print frequency of each throw
  val r = scala.util.Random
  val myRandoms = for (i <- 1 to 100) yield 2 * (r.nextInt(6) +1) //so we want two dice throws - 100 of them
  println(myRandoms)
  val averageOfThrows = myRandoms.sum/myRandoms.length.toDouble
  println(averageOfThrows)
  //myRandoms.foreach(println(myRandoms.groupBy(i=>i).mapValues(_.size)))
  //myRandoms.foreach(el => println(myRandoms.count(myRandoms)))
  val randMin = myRandoms.min
  val randMax = myRandoms.max
  val randFreq = (randMin to randMax).map(n => (n, myRandoms.count(_ == n)))
  println(randFreq)


}
