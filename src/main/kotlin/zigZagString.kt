fun main(){
    val str = "ABCD"
    println(convert(str, 3))
}

fun convert(s: String, numRows: Int): String {
    var str = ""
    if (numRows == 1 || numRows >= s.length) return s
    for(i in 0 until numRows){
        if( i == 0 || i == numRows-1 ){
            var index = 0
            while(index < s.length){
                if(i + index < s.length)
                    str += s[i + index]
                index += 2* numRows - 2
            }
        }else{

            str += s[i]
            var index = 2* numRows - 2
            while(index - i < s.length){
                str += s[index -i]
                //println(str)
                if(index + i < s.length)
                    str += s[index + i]
                index += 2* numRows - 2
            }
        }
    }
    return str
}