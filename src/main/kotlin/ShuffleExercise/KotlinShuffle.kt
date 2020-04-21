
fun main(args: Array<String>) {
    val deckofCard = arrayOfNulls<String>(52)
    for (i in deckofCard.indices) {
        deckofCard[i] = Integer.toString(i)
    }
    println("\nbefore shuffle")
    for (i in deckofCard) print("$i ")

    shuffle(deckofCard)
    println("\nafter shuffle")
    for (i in deckofCard) print("$i ")

    val list = mutableListOf<Int>()
}

fun shuffle(arr: Array<String?>) {
    val mid = arr.size / 2
    //val newArray = arrayOfNulls<String>(arr.size)
    //if (arr.size - 1 >= 0) System.arraycopy(arr, 0, newArray, 0, arr.size - 1)
    val newArray = arr.copyOf()
    //for( i in arr.indices)
    for (i in 0 until arr.size - 1) {
        if (i % 2 == 0) {
            arr[i] = newArray[i / 2]
        } else {
            arr[i] = newArray[i / 2 + mid]
        }
    }
}