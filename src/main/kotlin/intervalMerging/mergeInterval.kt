package intervalMerging


import java.util.*
import kotlin.collections.ArrayList


fun main(){
    var list = arrayListOf<Interval>(
        Interval(1,2),Interval(3,5), Interval(6,7),
        Interval(8,10), Interval(12,16)
    )
    println("\n before insertion : $list")
    println("\n after insertion : ${insert(list, Interval(4,9))}")
}

fun insert(
    intervals: ArrayList<Interval>,
    newInterval: Interval
): ArrayList<Interval> { // write your code here

        var mergeStartIndex = 0
        var mergeStopIndex = 0
        var newList: ArrayList<Interval>
    intervals.let{
         for (i in it.indices){
             if(it[i].start < newInterval.start && it[i].end > newInterval.start){
                 mergeStartIndex = i
             }
             if(it[i].start < newInterval.end && it[i].end > newInterval.end){
                 mergeStopIndex = i
             }
         }
        newList = ArrayList(it.subList(0,mergeStartIndex))
        newList.add(Interval(it[mergeStartIndex].start,it[mergeStopIndex].end))
        newList.addAll(it.subList(mergeStopIndex+1,it.size-1))
        print("\n startIndex = $mergeStartIndex, stopIndex = $mergeStopIndex ")
        print("\n startIndex = $mergeStartIndex, stopIndex = $mergeStopIndex ")
     }
    return newList
}




