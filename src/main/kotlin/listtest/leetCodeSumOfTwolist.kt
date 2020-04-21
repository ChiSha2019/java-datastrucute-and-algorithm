package listtest

import java.util.*

fun reverse(x : Int) :Int{
    val queue : Queue<Int> = LinkedList<Int>()
    var newInt = if (x >= 0) x else -x
    while( newInt > 0) {
        queue.add(newInt % 10)
        newInt /= 10
    }
    var returnInt : Long = 0
    while(!queue.isEmpty()){
        returnInt = returnInt * 10 + queue.remove()
        if(returnInt > Int.MAX_VALUE ) return 0
    }
    return if (x>=0) returnInt.toInt() else -returnInt.toInt()
}




fun main(){

    print(reverse(9999989))

}