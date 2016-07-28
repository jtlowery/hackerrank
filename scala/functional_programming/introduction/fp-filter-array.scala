// https://www.hackerrank.com/challenges/fp-filter-array
def f(delim:Int,arr:List[Int]):List[Int] = arr match {
     case x :: xs => if (x < delim) x :: f(delim, xs) else f(delim, xs)
     case Nil => Nil
 }

