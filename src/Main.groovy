static void main(String[] args) {
    def list = [1, 3, 4, 5, 1, 5, 4]
    def countMap = [:]
    list.each { num ->
        countMap[num] = countMap.containsKey(num) ? countMap[num] + 1 : 1
    }
    println countMap
}

