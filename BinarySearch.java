import java.util.Scanner;

public  class BinarySearch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        int ans=binarysearch(arr,target);
        System.out.println("The element is present in the no of the index at: "+ans);
    }
    static  int binarysearch(int arr[],int target ){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
//            int mid=(start+end)/2;
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;


            }
            else if(target>arr[mid]){
                start=mid+1;

            }else{
                return  mid;
            }

        }
        return  -1;
    }
}



//orderAgnostic Binary Search
//public  class BinarySearch {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=scan.nextInt();
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
//        }
//
//        return  -1;
//
//    }
//}

