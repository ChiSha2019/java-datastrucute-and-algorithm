package palindromeNumber

import java.util.*

fun main(){
    print(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
    val stack = Stack<Int>()
    var newNum = x

    if( x == 0) return true
    if(x < 0) return false
    if(x >0) {
        while (newNum > 0) {
            stack.add(newNum % 10)
            newNum /= 10
        }
        newNum = x
        while (!stack.isEmpty()){
            if (stack.pop() != newNum % 10) return false
            newNum /= 10
        }
        return true
    }

    return false

}