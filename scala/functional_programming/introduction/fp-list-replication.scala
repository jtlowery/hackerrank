// https://www.hackerrank.com/challenges/fp-list-replication
def f(num:Int,arr:List[Int]):List[Int] = {
    arr.flatMap(x => List.fill(num)(x))
}

