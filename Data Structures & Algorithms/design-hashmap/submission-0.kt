class MyHashMap() {

    val storage = IntArray(1_000_001) {-1}

    fun put(key: Int, value: Int) {
        storage[key] = value
    }

    fun get(key: Int): Int {
        return storage[key]

    }

    fun remove(key: Int) {
        storage[key] = -1

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
