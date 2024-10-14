import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


//public class Array {
//    public static void main(String[] args) {
//        //Store a roll number
//        //Syntax
//        //datatype[]variable_name=new datatype[size];
//        //store 5 roll number;
//
////        int []rnos=new int[5];
//        //or directly
////        int []rnos2={23,21,45,32,15};
////        int []ros; //declaration of the array. ros is getting defined in the stack
////        ros=new int[5]; //initialistation: actually here object is being created in the memory (heap)
////        System.out.println(rnos2.toString());
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
////
//        int arr[]=new int[n];
//        for(int i=0;i<=n;i++){
//            arr[i]=scan.nextInt();
//        }
//        for(int i=0;i<=n;i++){
//            System.out.println(Arrays.toString(arr));
//        }
//
//
//    }
//}


//public class Array
//{
//    public  static  void main(String args[]){
//        Scanner scan=new Scanner(System.in);
////        int n=scan.nextInt();
//        int []nums={3,4,5,12};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    static  void change(int []arr){
//        arr[0]=99;
//    }
//}


//Multidimensional Array
//public  class Array {
//    public static  void main(String [] args){
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int m=scan.nextInt();
//        int arr[][]=new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j]=scan.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//public  class Array
//{
//    public  static  void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int [][]arr=new int[3][3];
//
//        System.out.println(arr.length); //no. of rows
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                arr[row][col]=scan.nextInt();
//
//            }
//        }
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
////                arr[row][col]=scan.nextInt();
//
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//output:
//1 2 3
// 4 5 6
// 7 8 9


//To print the array in the other method
//public  class Array
//{
//    public  static  void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int [][]arr=new int[3][3];
//
//        System.out.println(arr.length); //no. of rows
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                arr[row][col]=scan.nextInt();
//
//            }
//        }
//        for(int row=0;row<arr.length;row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//    }
//}
//output:
//[1, 2, 3]
//[4, 5, 6]
//[7, 8, 9]



//Linear search in the array
import java.util.*;
import java.util.Scanner;
//public  class  Array {
//    public static void main(String args[]) {
//        Scanner scan=new Scanner(System.in);
//
//      int n=scan.nextInt();
//      int arr[]=new int[n];
//      for(int i=0;i<n;i++){
//          arr[i]=scan.nextInt();
//
//      }
//        System.out.print("Enter the element you want to search: ");
//      int key=scan.nextInt();
////      flag found=0;
//        boolean found=false;
//      for(int i=0;i<n;i++){
//          if(arr[i]==key){
//              System.out.println("The element is present in the index "+i);
//              found=true;
//              break;
//          }
//
//
//
//
//        }
//
//    if(!found){
//        System.out.println("The element is not present in the array");
//    }
//
//
//    }
//}



//Search in the String
//public class Array {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        String name=scan.nextLine();
//
//        char target=scan.next().charAt(0);
////        System.out.println(search(name,target));
//        search(name,target);
//    }
//
//    static void search(String str, char target) {
//
//        if (str.length() == 0) {
//            System.out.println("The chacter is not present in the string");
//        }
//        for(int i=0;i<str.length();i++){
//            if(target==str.charAt(i)){
//                System.out.println("The chaacter is present in the string ");;
//            }
//        }
//
//
//    }
//
//}



//Search in the range
//public class Array
//{
//    public  static  void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//    }
//    static  int linearSearch(int arr[],int target,int start,int end){
//        if(arr.length==0){
//            return  -1;
//        }
//        for(int i=0;i<=end;i++){
//            int element=arr[i];
//            if(element==target){
//                return  i;
//            }
//        }
//        return  -1;
//    }
//}

//Find maximum and minimum number
//public class Array {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//      int arr[]=new int[n];
//      for(int i=0;i<n;i++){
////          arr[]=new int[i];
//          arr[i]=scan.nextInt();
//      }
////        System.out.println(min(arr));
//        System.out.println("the minimum element in the array is: "+min(arr));
////      min(arr);
//    }
//    static  int min(int arr[]){
//        int min= Integer.MAX_VALUE;
//        if(arr.length==0){
//            return -1;
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min){
//           min=arr[i];
//            }
//        }
//        return min;
//    }
//}
//
//public  class Array {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int m=scan.nextInt();
//        int arr[][]=new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j]=scan.nextInt();
//            }
//        }
//    }
//    static  int search2D(int arr[][],int target){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;arr[i].length;j++){
//                if(arr[i][j]==target){
//                    return  arr[][j];
//                }
//
//            }
//            return  1;
//        }
//    }
//}



//Binary Search Algorithm
//public  class Array {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//    arr[i]=scan.nextInt();
//        }
//        int target=scan.nextInt();
//        int ans=binarysearch(arr,target);
//        System.out.println("The element is present in the no of the index at: "+ans);
//    }
//    static  int binarysearch(int arr[],int target ){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
////            int mid=(start+end)/2;
//            int mid=start+(end-start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//
//
//            }
//            else if(target>arr[mid]){
//                start=mid+1;
//
//            }else{
//                return  mid;
//            }
//
//        }
//        return  -1;
//    }
//}
//
//
//public  class Array {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//      int n=scan.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//    arr[i]=scan.nextInt();
//        }
//        int target=scan.nextInt();
//        int ans=orderAgnosticBS(arr,target);
//        System.out.println("The element is present in the no of the index at: "+ans);
//    }
//    static  int orderAgnosticBS(int arr[],int target){
//        //find wheter the array is sorted in ascending or descending
//
//        int start=0;
//        int end=arr.length-1;
//        boolean isAsc=arr[start]<arr[end];
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]==target){
//                return  mid;
//            }
//            if(isAsc) {
//                if(target<arr[mid]){
//                    end=mid-1;
//
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//            else{
//                if(target>arr[mid]){
//                    end=mid-1;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//            }
//
//        return  -1;
//
//    }
//}

