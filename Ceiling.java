import java.util.Scanner;

public  class Ceiling {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        int ans=ceiling(arr,target);
        System.out.println("The element is present in the no of the index at: "+ans);
    }
//    return the index of smallest no or greater than equal to the target
    static  int ceiling(int arr[],int target ){
        //but what if the target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return  -1;
        }
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
        return  start;
    }
}