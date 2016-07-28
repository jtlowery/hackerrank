// https://www.hackerrank.com/challenges/fp-sum-of-odd-elements
def f(arr:List[Int]):Int = arr.filter(x => x % 2 == 1 || x % 2 == -1).sum

