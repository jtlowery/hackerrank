// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers
object Solution {
    
     def fibonacci(x:Int):Int = {
          
      // Fill Up this function body
        // You can add another function as well, if required
         def loop(n: Int, prev: Int, curr: Int): Int = {
             if (n == 1) prev
             else loop(n - 1, curr, prev + curr)
         }
         loop(x, 0, 1)
     }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}
