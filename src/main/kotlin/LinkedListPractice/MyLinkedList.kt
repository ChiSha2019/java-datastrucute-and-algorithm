package LinkedListPractice

class MyLinkedList {
        var head: Node? = null
        var tail: Node? = null
        var length: Int = 0
        inner class Node(var value: Any?){
            var next: Node? = null
        }
        /* Add a node before the first element of the linked list */
        fun addAtHead(value: Any?){
            val h = this.head
            val newNode = Node(value)
            newNode.next = this.head
            head = newNode
            if (h == null) tail = newNode
            this.length++
        }
        /* Append a node to the last element of the linked list. */
        fun addAtTail(value: Any?){
            var h = head
            val newNode = Node(value)
            newNode.next = null
            while (h!!.next !=null) h = h.next
            h.next = newNode
            tail = newNode
            this.length++
        }
        /* Add a node before the index-th node in the linked list */
        fun addAtIndex(index: Int, value: Any?){
            var h = head
            var newNode = Node(value)
            var counter = 0
            if (index < 0 || index > this.length) return
            if (index == 0) {
                addAtHead(value)
                return
            }
            if (index == this.length) {
                addAtTail(value)
                return
            }
            while (counter != index-1){
                h = h!!.next
                counter++
            }
            newNode.next = h!!.next
            h.next = newNode
            this.length++
        }
        /* Delete the index-th node in the linked list, if the index is valid. */
        fun deleteAtIndex(index: Int) {
            var curr = this.head
            var prev:Node? = null
            var counter = 0
            if (index < 0 || index >= this.length) return
            if (index == 0){
                head = curr!!.next
                this.length--
                return
            }
            while (counter != index){
                prev = curr
                curr = prev!!.next
                counter++
            }
            prev!!.next = curr!!.next
            if (index == length-1) tail = prev
            this.length--
        }
        /*  Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        fun get(index: Int): Any?{
            var h = head
            var counter = 0
            if (index < 0 || index >= this.length) return -1
            while (counter != index){
                h = h!!.next
                counter++
            }
            return h!!.value
        }

        fun displayLinkedList() {
            var pointer = head
            while (pointer != null ){
                print("${pointer?.value} ")
                pointer = pointer?.next
            }
        }

        fun reverseLinkedList(){
            val list = mutableListOf<Node>()
            var pointer = head
            while (pointer?.next != null ){
                list.add(pointer as Node)
                pointer = pointer?.next
            }
            list.reverse()
            head = tail
            list.forEach {
                tail?.next = it
                tail = tail?.next
            }
            tail?.next = null

        }


    fun printMiddle() {
        var slow_ptr = head
        var fast_ptr = head
        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next!!.next
                slow_ptr = slow_ptr!!.next
            }
            println("The middle element is [" +
                    slow_ptr?.value.toString() + "] \n")

        }
    }

    }
fun main(){
    val linkedList = MyLinkedList()
    linkedList.addAtHead(1)
    for (i in 2..10)
        linkedList.addAtTail(i)

    linkedList?.let {
        println("print the mid element")
        it.printMiddle()

        it.reverseLinkedList()
        println("print the reversed linked list")
        it.displayLinkedList()
    }

}