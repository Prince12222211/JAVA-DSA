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

