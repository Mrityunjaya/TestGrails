def isElementInList = { List<Integer> list, int num ->
    return list.contains(num)
}

List<Integer> l = [1, 2, 3, 4, 6]
int num = 2
println isElementInList(l, num)