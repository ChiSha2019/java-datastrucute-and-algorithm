package matrixZeroDistance

import kotlin.math.abs

fun main(){
    val mat : Array<IntArray> = arrayOf(intArrayOf(0,0,0), intArrayOf(0,1,0), intArrayOf(0,0,0))
    updateMatrix(mat)
    print(mat)
}
fun updateMatrix(matrix: Array<IntArray>): Array<IntArray> {
    var distanceMat = Array<IntArray>(matrix.size){ intArrayOf()}
    for(i in matrix.indices){
        for (j in matrix[i].indices){
            if(matrix[i][j] == 0){
                distanceMat[i][j] = 0
            }else{
                distanceMat[i][j] = nearestDisToZero(matrix, i,j)
            }
        }
    }
    return distanceMat
}

fun nearestDisToZero(matrix: Array<IntArray>, row: Int, col: Int): Int {
    var distance = matrix.size
    var curDis: Int = 0
    for(i in matrix.indices){
        for (j in matrix[i].indices){
            curDis = abs(row -i) + abs(col - j)
            if( distance > curDis){
                distance = curDis
            }
        }
    }
    return curDis
}
