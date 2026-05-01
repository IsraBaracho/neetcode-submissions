class MyHashSet() {

    private val storage = BooleanArray(1_000_001) { false }

    fun add(key: Int) {
        storage[key] = true
    }

    fun remove(key: Int) {
        storage[key] = false
    }

    fun contains(key: Int): Boolean {
        return storage[key]
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
