/**
 * Created by mj on 30/12/15.
 */
person = new Person(name: "himanshu", "age": 20, address: "R-2/123", gender: "male");
println person.address
println person.@address


class ExtendedPerson extends Person {
    String phone;
}

extendedPerson = new ExtendedPerson(name: "himanshu", "age": 20, address: "R-2/123", gender: "male", phone: "9899191675")
println extendedPerson.phone