// https://www.hackerrank.com/challenges/fp-hello-world-n-times
def f(n: Int): Unit = {
    if (n == 1) println("Hello World")
    else {
        println("Hello World")
        f(n - 1)
    }
}
