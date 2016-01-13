List l = [1, 2, 4, 67, 7, "as"]
l.eachWithIndex{value, index ->
    println "value is "+ value + " At index " + index
}

l.reverseEach{
println it
}

l = l.collect{it.multiply(2)}
println l.sum({"a"})

List l2 = [1, 2, 3, 4, 5, 6, [45, 54, 32], 7]
l2.flatten()
println l2.sort()