List l = [1, 2, 4, 67, 7, "as"]
List l2 = [1, 2, 3, 4, 5, 6, 7]

//println l.any{it%2==0}

def r = 1..100
r = '#'..'~'
//println r

public static void main(String[] args){
    System.out.println("Hi");
}

//main()

l2.groupBy{it%2 == 0}