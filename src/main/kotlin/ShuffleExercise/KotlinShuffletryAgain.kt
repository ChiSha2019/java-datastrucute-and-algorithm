package ShuffleExercise

class KotlinShuffletryAgain {

}
fun main(){
    var array = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("\nbefore shuffle")
    for (i in array) print(i)
    shuffle(array)
    println("\nafter shuffle")
    for (i in array) print(i)
}

fun shuffle(arr : Array<Int>){
    val mid = arr.size/2
    val arrCopy = arr.copyOf()
    for (i in arr.indices){
        if( i %2 == 0){
            arr[i] = arrCopy[i/2]
        }else{
            arr[i] = arrCopy[i/2 + mid]
        }
    }
}