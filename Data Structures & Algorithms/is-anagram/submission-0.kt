class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val map = HashMap<Char, Int>()
        for(char in s){
            map[char] = map.getOrDefault(char, 0) + 1
        }

        for(char in t){
            if(map.containsKey(char)){
                map[char] = map.getOrDefault(char, 0) - 1
            }
        }

        if(map.values.all { it == 0 }){
            return true
        } else { return false }
    }
}
