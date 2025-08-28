
fun merge_sort(list: List<Int>): List<Int>{
    if (list.size <= 1){
        return list
    }
    var meio = list.size/2

    var left = merge_sort(list.subList(0,meio))
    var right = merge_sort(list.subList(meio, list.size))

    return merge(left, right)
}

fun merge(left: List<Int>, right:List<Int>): List<Int>{
    if (left.isEmpty()) return right
    if (right.isEmpty()) return left

    if (left[0]<right[0]){
        return listOf(left[0]) + merge(left.subList(1,left.size), right)
    }
    return listOf(right[0]) + merge(left,right.subList(1,right.size))
}

fun main(){
    var list = mutableListOf(9, 3, 1, -5, 20, 8)
    println(merge_sort(list))
}