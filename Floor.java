import java.util.Scanner;

public  class Floor {
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
    //    return the index of greatest nummber <= target
    static  int ceiling(int arr[],int target ){
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
        return  end;
    }
}