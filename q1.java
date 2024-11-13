import java.util.Scanner;
// class q1{
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     String name=sc.nextLine();
//     int age=sc.nextInt();
//     String address=sc.nextLine();
//     System.out.println("My name is "+name);
//     System.out.println("My age is "+age);
//     System.out.println("I'm from "+address);
//     }
// }

class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double score=sc.nextDouble();
        sc.nextLine();
        String dept=sc.nextLine();
        System.out.println("my name is "+name);
        System.out.println("my score is "+score/10+"/10");
        System.out.println("my dept is "+dept);
    }
}