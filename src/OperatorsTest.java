public class OperatorsTest {
    public static void main(String[] args) {

        int age = 30;

        // UnaryOperators
        System.out.println("Your age is " + age++);     // Your age is 30
        System.out.println("Your age is " + ++age);		//Your age is 32
        System.out.println("Your age is " + age--);		//Your age is 32
        System.out.println("Your age is " + --age);		//Your age is 30

        // Relational Operator:
        int a = 100, b = 200;

        System.out.println(a>b);  		//false
        System.out.println(a<b);  		//true
        System.out.println(a>=b);  		//false
        System.out.println(a<=b);		//true
        System.out.println(a==b);		//false
        System.out.println(a!=b);		//true


        //TernaryOperator
        System.out.println((a > b)? a:b);	//200
        System.out.println((a < b)? a:b);   //100

        //AssignmentOperator

        System.out.println(a+=4); //104
        System.out.println(a-=4); //100
        System.out.println(a*=4); //400
        System.out.println(a/=4); //100

    }

}
