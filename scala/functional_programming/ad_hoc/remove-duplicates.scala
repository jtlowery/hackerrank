// https://www.hackerrank.com/challenges/remove-duplicates
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val stdin = io.Source.stdin.getLines().toList
        def removeDups(ss: List[Char], usedLetters: Map[Char, Int]): String = 
            ss match {
                case Nil => ""
                case s :: xs => {
                        if (usedLetters.getOrElse(s, 0) < 1) 
                            s + removeDups(xs, usedLetters + (s -> (usedLetters.getOrElse(s, 0) + 1)))
                        else removeDups(xs, usedLetters + (s -> (usedLetters.getOrElse(s, 0) + 1)))
                    }
        }
        println(removeDups(stdin.head.toList, Map[Char, Int]()))
    }
}
