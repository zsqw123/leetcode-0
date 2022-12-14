package util

class ListNode(@JvmField var `val`: Int = 0) {
    constructor() : this(0)

    @JvmField
    var next: ListNode? = null

    companion object {
        fun fromIntArray(intArray: IntArray): ListNode? {
            if (intArray.isEmpty()) return null
            val dummy = ListNode(0)
            var now = ListNode(intArray[0])
            dummy.next = now
            for (i in 1 until intArray.size) {
                val new = ListNode(intArray[i])
                now.next = new
                now = new
            }
            return dummy.next
        }
    }

    override fun toString(): String {
        return `val`.toString() + " " + next.toString()
    }
}