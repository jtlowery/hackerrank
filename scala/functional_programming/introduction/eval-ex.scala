// https://www.hackerrank.com/challenges/eval-ex
def f(x: Float):Float=
  {   
       // Compute and Return the value of e^x 
    def expansion(x: Float, n: Int): Float = {
            (scala.math.pow(x, n) / factorial(n)).toFloat
        }
        
    def factorial(n: Int): Int = {
            if (n == 0) 1 else n * factorial(n - 1)
        }
    
    def loop(n: Int, x: Float): Float = {
        if (n == 0) expansion(x, n)
        else expansion(x, n) + loop(n - 1, x)
    }
    loop(9, x)
  }
