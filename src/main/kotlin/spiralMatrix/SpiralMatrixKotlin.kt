package spiralMatrix


class SpiralMatrix {
}

fun main(){
    //int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    val arr = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(6, 7, 8, 9, 10),
        intArrayOf(11, 12, 13, 14, 15),
        intArrayOf(16, 17, 18, 19, 20),
        intArrayOf(21, 22, 23, 24, 25)
    )
    traversal(arr, arr.size - 1, 1, arr[0].size - 1, 0, 0, arr.size - 1, true)
}

fun traversal(
    array: Array<IntArray>, row: Int, startCol: Int,
    stopCol: Int, col: Int, startRow: Int, stopRow: Int, reverse: Boolean
) {
    colTraversal(array, col, startRow, stopRow)

    if (array.size % 2 == 0) {
        if (col == row + 1) {
            return
        }
    }

    if (array.size % 2 != 0 && col == row) return

    rowTraversal(array, row, startCol, stopCol)

    val newreverse = !reverse
    val newrow = if (newreverse) array.size - 1 - row else array.size - row - 2
    val mewcol = if (newreverse) array[0].size - 1 - col else array[0].size - col
    println("column: $mewcol")

    val newStartRow: Int = if (newreverse) stopRow - 1 else stopRow + 1
    val newStopRow: Int = startRow
    val newStartCol: Int = if (newreverse) stopCol - 1 else stopCol + 1
    val newStopCol: Int = startCol

  traversal(
        array,
        newrow,
        newStartCol,
        newStopCol,
        mewcol,
        newStartRow,
        newStopRow,
        newreverse
    )
}

fun rowTraversal(arr: Array<IntArray>, row: Int, startCol: Int, stopCol: Int) {
    if (startCol <= stopCol) {
        for (i in startCol..stopCol) {
            println(arr[row][i])
        }
    } else {
        for (i in startCol downTo stopCol) {
            println(arr[row][i])
        }
    }
}

fun colTraversal(arr: Array<IntArray>, col: Int, startRow: Int, stopRow: Int) {
    if (startRow <= stopRow) {
        for (i in startRow..stopRow) println(arr[i][col])
    } else {
        for (i in startRow downTo stopRow) {
            println(arr[i][col])
        }
    }
}