// data types :int,String
// variables: a,b,c,d
// operators: =,+,-,/,%

// class addNum{
//     public static void main(String args[]){
//         int a=10;
//         int b=20;
//         int c=40;
//         int d=a+b+c;
//         System.out.println(c);
//     }
// }


// User to give input and add two numbers

import java.util.Scanner;
class addNum{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=obj.nextInt();
        System.out.println("Enter second number");
        int num2=obj.nextInt();
        int add=num1+num2;
        System.out.println("Added: "+add);
    }
}