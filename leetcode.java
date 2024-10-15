import java.util.Scanner;

//public class leetcode {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        // Input for the size of the array
//        int n = scan.nextInt();
//        char letters[] = new char[n];
//
//        // Input for the letters array
//        for(int i = 0; i < n; i++) {
//            letters[i] = scan.next().charAt(0);  // Reads a single character input
//        }
//
//        // Input for the target character
//        char target = scan.next().charAt(0);
//
//        // Call the function
//        char ans = nextGreatesLettter(letters, target);
//        System.out.println("The next greatest letter is: " + ans);
//    }
//
//    static char nextGreatesLettter(char letters[], char target) {
//        int start = 0;
//        int end = letters.length - 1;
//
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if(target < letters[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        return letters[start % letters.length];  // Handles circular nature of array
//    }
//}


public  class leetcode {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }

    }
  public   int[] searchRange(int [] nums, int target){
        int []ans={-1,-1};

        //check for the first occurence if target first
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return  ans;
    }
    //this function just returns the index value of the taget
    int search(int[] nums,int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
//            int mid=(start+end)/2;
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;


            }
            else if(target>nums[mid]){
                start=mid+1;

            }else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return  ans;

    }

}