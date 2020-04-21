package stringTraversal

import java.util.*

fun main(){
    val s = "bb"
    print(longestPalindrome(s))
}

fun longestPalindrome(s: String): String {
    var subString = ""
    var maxLength = 0
    if(s.length <= 1) return s
    for(winLength in 1..s.length){
        for(j in 0 ..s.length - winLength){
            if(isPlindrome(s.substring(j,j+winLength)))
                println("substring = ${s.substring(j,j+winLength)}")
                if (winLength > maxLength){
                    maxLength = winLength
                    subString = s.substring(j,j+winLength)
                }
        }
    }
    return subString
}

fun isPlindrome(s: String): Boolean{
    for(i in 0 until s.length/2){
        println("s[i] = ${s[i]}")
        if(s[i] != s[s.length - i -1]){
            return false
        }
    }
    return true
}