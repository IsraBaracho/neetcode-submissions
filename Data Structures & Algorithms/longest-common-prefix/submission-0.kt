class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var word: String = ""
        var i = 0

        while (i < strs[0].length){
            val referencia = strs[0][i]
            var todosIguais = true
            for(str in strs){
                if(i >= str.length || str[i] != referencia){
                    todosIguais = false
                    break
                }
            }
            if (!todosIguais) break
            word += referencia
            i++
        }
        return word
    }
}
