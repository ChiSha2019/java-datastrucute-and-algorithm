package stringPractice

fun main(){

    println(lengthOfLongestSubstring("abcabcbb"))
}

    fun lengthOfLongestSubstring(s: String): Int {
        val mySet = mutableSetOf<Char>()
        var i = 0
        var j = 0
        var maxLength = 0
        while (i < s.length && j< s.length) {
            if( !mySet.contains(s[j])){
                mySet.add(s[j++])
                if(mySet.size > maxLength) maxLength = mySet.size
            }else{
                mySet.remove(s[i++])
            }
        }
        return maxLength
    }

