package kotlinTest

class CompareTwoNum(val calculator: Calculator, val firstNum : Int, val secondNum : Int) {
    fun compare( firstNum: Int, secondNum: Int) : String =
        if(calculator.subtract(firstNum , secondNum)>0) "first is greater"
    else "second is greater"
}