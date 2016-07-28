// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list
def f(arr:List[Int]):List[Int] = {
   arr.zipWithIndex.filter(x => x._2 % 2 == 1).map(x => x._1)
}
