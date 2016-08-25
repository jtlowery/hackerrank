# https://www.hackerrank.com/challenges/map-and-lambda-expression
# Enter your code here. Read input from STDIN. Print output to STDOUT
def fib(n):
    if n == 0: 
        return 0
    elif n == 1 or n == 2: 
        return 1
    else: 
        return fib(n - 1) + fib(n - 2)

N = raw_input()
print map(lambda x: x**3, [fib(n) for n in range(int(N))])
