// https://www.hackerrank.com/challenges/rotate-string
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
       val inp = scala.io.StdIn.readLine().toInt
       for (i <- 0 until inp) {
           //println(scala.io.StdIn.readLine())
           val string = scala.io.StdIn.readLine()
           println(rotate(string.length, string, ""))
       }
    }
    
   def rotate(n: Int, s: String, acc: String): String = {
       val s2 = s.tail + s.head
       if (n >= 1) rotate(n-1, s2, acc+s2+" ")
       else acc
   }
}
