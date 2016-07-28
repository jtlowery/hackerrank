// https://www.hackerrank.com/challenges/fp-update-list
def f(arr:List[Int]):List[Int] = arr match {
    case x::xs => if (x < 0) (-1)*(x) :: f(xs) else x :: f(xs)
    case Nil => Nil
}

