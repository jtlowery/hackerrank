// https://www.hackerrank.com/challenges/fp-list-length
def f(arr:List[Int]):Int = arr match {
    case h :: xs => f(xs) + 1
    case Nil => 0
}
