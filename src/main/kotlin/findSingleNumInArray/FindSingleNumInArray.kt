package findSingleNumInArray

class FindSingleNumInArray {
    
    fun middleNode(head: ListNode?): ListNode? {
        return traverse(head, head)
    }
    fun traverse(fpointer: ListNode?,spointer: ListNode?): ListNode? =
         if (fpointer?.next == null)
            spointer
        else
            traverse(fpointer?.next?.next, spointer?.next)


}

class ListNode(var value: Int) {
  var next: ListNode? = null
}