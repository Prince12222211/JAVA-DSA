import java.util.*;
import java.util.Scanner;

// public class Main {

//   public static void main(String args[]) {
//     Scanner scan = new Scanner(System.in);
//     int a = scan.nextInt();
//     int b = scan.nextInt();
//     int c = scan.nextInt();
//     // int max = Math.max(Math.max(a, b), c);
//     // System.out.println(max);
//     //    int max=a;
//     //    if(b>max){
//     //     max=b;
//     //    }
//     //    if(c>max){
//     //     max=c;
//     //    }
//     //    System.out.println(max);
//     int max = Math.max(c, Math.max(a, b)); //For calculating the large value
//     System.out.println(max);
//   }
// }


//To check its lowerCase and upperCase
// public class Main{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         char ch=scan.next().trim().charAt(0);
//         if(ch>='a'&&ch<='z'){
//             System.out.println("LowerCase!");
//         }
//         else{
//             System.out.println("UpperCase");
//         }
    
//     }
// }



//Fibonacci Series
// public class Main{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int a=0; int b=1;
//         System.out.print("Fibonacci Series: "+a+", "+b);
//         for(int i=2;i<n;i++){
//             int next=a+b;
//             System.out.print(", "+next);
//             a=b;
//             b=next;
//         }

//     }
// }

//To find fibonaci number from the series
// public class Main{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int a=0;
//         int b=1;
//         int cnt=2;
//         while(cnt<=n){
//             int temp=b;
//             b=b+a;
//             a=temp;
//             cnt++;
//         }
//         System.out.println(b);
//     }
// }

//CountNums
// public class Main{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int count=0;
//         while(n>0){
//             int rem=n%10;
//             if(rem==5){
//                 count++;
//             }
//             n=n/10;
//         }
//         System.out.println(count);
//     }
// }


//Rerverse The digit
// public class Main{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Enter the digit: ");
//         int n=scan.nextInt();
//         int ans=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             n=n/10;
//             ans=ans*10+rem;

//         }
// System.out.println("The Reverse Digit is: "+ans);
//     }
// }



//Calculator
// public class Main{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int ans=0;
//         while(true){
//             System.out.print("Enter the Opertor: ");
//             char op=scan.next().trim().charAt(0);
//             if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
//                 System.out.print("Enter two Number: ");
//                 int a=scan.nextInt();
//                 int b=scan.nextInt();
//                 if(op=='+'){
//                     ans=a+b;
//                 }
//                 if(op=='-'){
//                     ans=a-b;
//                 }
//                 if(op=='*'){
//                     ans=a*b;
//                 }
//                 if(op=='/'){
//                     if(b!=0){
//                         ans=a/b;
//                     }
//                 }
//                 if(op=='%'){
//                     ans=a%b;
//                 }
                
//             }
//         else if(op=='X'||op=='x'){
//             break;
//         }
//         else{
//             System.out.println("Invalid Operation!");
//         }
//         System.out.println(ans);
//         }

//     }
// }




//Switch Case
// public class Main{
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String fruit=scan.next();
//         switch(fruit){
//             case"Mango":
//                 System.out.println("The king of fruit!");
//                 break;
//                 case"Apple":
//                     System.out.println("Red sweet fruit!");
//                     break;
//                     case "Orange":
//                     System.out.println("Round shape fruit!");
//                     break;
//                     case "Grapes":
//                         System.out.println("Smallest fruit!");
//                         break;
//                     default:
//                         System.out.println("Enter a valid input!");
                        
                    
                        
//         }
//     }
// }


//Function Method
// public class Main{
//     static void sum(){
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Enter The Number1: ");
//         int num1=scan.nextInt();
//         System.out.print("Enter the number2: ");
//         int num2=scan.nextInt();
//         int sum=num1+num2;
//         System.out.print("The Sum is: "+sum);
//     }
//     public static void main(String args[]){
//         sum();
//     }
// }

// public class Main{
//     static String Mygreet(String name){
//         String message="Hello "+name;
//         return message;
//     }
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name=scan.nextLine();
//         String greet=Mygreet(name);
//         System.out.print(greet);
//     }
// }