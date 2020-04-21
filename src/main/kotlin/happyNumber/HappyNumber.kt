package happyNumber

fun main(){
    val n = 3
    println(check(n))
}
val loopList = mutableListOf<Int>()
fun check(n:Int): Boolean{
    if(isOne(n)) return true
    if(loopList.contains(n)) return false
    else loopList.add(n)

    println(happySum(n))
    return check(happySum(n))
}

fun isOne(n : Int): Boolean {
    var sum = 0
    var num = n
    while (num > 0) {
        if (num % 10 != 0 && num % 10 != 1) return false
        sum += num % 10
        num /= 10
    }
    return sum == 1
}

fun happySum(n : Int) :Int{
    var n1 = n
    var newNum = 0
    while (n1>0){
        newNum += (n1%10) * (n1%10)
        n1 /= 10
    }
    return newNum
}