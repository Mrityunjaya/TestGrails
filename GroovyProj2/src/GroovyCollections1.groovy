List a = [1,2,3,4,5]
a.add(6)
println a
a.tail()
a.subList(0,3)
a.getAt(1..3)

List a2 = [1,2,3,3,4,5,6,6]
Set s1 = a2 as Set
println s1
a2.removeAll(3)
println a2

class User{
String name
String id
}

List obj = [new User(id:"1", name:"abc"), new User(id:"2", name:"def")]
println obj.name

obj.find{
it.name == "abc"
}.name