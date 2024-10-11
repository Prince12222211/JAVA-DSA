import javax.sql.rowset.spi.SyncResolver;
import java.sql.SQLOutput;
import  java.util.*;
import java.util.Scanner;

import static java.util.Collections.swap;


//Prime Number check
//public class Question {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        boolean ans=isPrime(n);
//        System.out.println(ans);
//
//
//    }
//
//    static boolean isPrime(int n) {
//        if (n <= 1) {
//            return  false;
//
//        }
//        int c=2;
//        while(c*c<=n){
//            if(n%c==0){
//                return  false;
//            }
//            c++;
//        }
//      return  c*c>n;
//
//    }
//}


//Armstrong Number
//public  class Question
//{
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Enter the number:");
////        int n=scan.nextInt();
////        boolean ans=isArmstrong(n);
////        System.out.println(ans);
//        for(int i=0;i<1000;i++){
//            if(isArmstrong(i)){
//                System.out.println("The armstrong numbers are: "+i+" ");
//            }
//        }
//
//    }
//    static  boolean isArmstrong(int n){
//        int orig=n;
//        int sum=0;
//        while(n>0){
//            int rem=n%10;
//            n=n/10;
//            sum=sum+rem*rem*rem;
//        }
//        if(sum==orig){
//            return  true;
//        }
//        return false;
//    }
//}



//Arrays question
//1.Swapping the array
//public  class Question {
//    public  static  void main(String[]args) {
//        Scanner scan = new Scanner(System.in);
//        int arr[] = {1, 3, 23, 9, 18};
//        swap(arr, 0, 4);
//        System.out.println(Arrays.toString(arr));
//    }
//        public static  void swap(int arr[],int indx1,int ind2){
//    int temp=arr[indx1];
//    arr[indx1]=arr[ind2];
//    arr[ind2]=temp;
//
//
//
//    }
//}


public class Question {
    public static void main(String args[]) {
        int arr[] = {1, 2, 32, 2431, 21};
        System.out.println("The maximum value of the array is: " + max(arr));
        System.out.println("The minimum value of the array is: " + min(arr));
        System.out.println("The maximum number in the range is: " + maxRange(arr, 0, 3));

        Reverse(arr);
        System.out.print("The reversed array is: ");
        printArray(arr);  // Printing the reversed array
    }

    static void Reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int max(int arr[]) {
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_val) {
                max_val = arr[i];
            }
        }
        return max_val;
    }

    static int min(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Function to print the array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
