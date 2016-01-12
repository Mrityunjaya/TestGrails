def outerVariable = 'outside'
def testOuter={num->
println 'this was not here ' + outerVariable
println 'Inside :: ' + num
}

testOuter(99)
def sumClo={int num->
return num+10
}

int sum(int num, Closure closure){
return closure(num)
}


println sum(10, {it+10})

3.times{println "hi"}

def date = new Date()
println date

println 'str2ing2' - 2

int sum(int x, int y, int z = 10){
println "x:${x}, y:${y}, z:${z}"
return x+y+z
}

sum(10, 20)