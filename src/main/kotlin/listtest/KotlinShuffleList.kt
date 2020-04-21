package listtest

fun main(args: Array<String>){
    //val deckCardlist  = mutableListOf<Int>()
    val deckCardlist = MutableList<String>(52){ (it + 1).toString() }
/*    for (i in 1 until 52){
        deckCardlist.add(i)
    }*/
    println("\n card before shuffle")
    println(deckCardlist)
    shuffle(deckCardlist)
    println("\n card after shuffle")
    println(deckCardlist)
}

fun shuffle(list : MutableList<String>){
    val mid = list.size / 2
    val listCopy = list.toList()
    for(i in 0 until list.size){
        if(i % 2 == 0){
            list[i] = listCopy[i/2]
        }else{
            list[i] = listCopy[i/2 + mid]
        }
    }
}