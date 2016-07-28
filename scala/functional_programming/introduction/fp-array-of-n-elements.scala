// https://www.hackerrank.com/challenges/fp-array-of-n-elements
def f(num:Int) : List[Int] = {
    def loop(n: Int, xs: List[Int]): List[Int] = {
        if (n == num) n :: xs
        else loop(n + 1, n :: xs)
    }
    loop(1, List[Int]())    
}
