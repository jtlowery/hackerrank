// https://www.hackerrank.com/challenges/fp-reverse-a-list
def f(arr:List[Int]): List[Int] = {
    def loop(toreverse: List[Int], acc: List[Int]): List[Int] = 
       toreverse match {
        case Nil => acc
        case x :: xs => loop(xs , x::acc)
    }
    loop(arr, Nil)
}
