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


//public  class leetcode {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]= scan.nextInt();
//        }
//
//    }
//  public   int[] searchRange(int [] nums, int target){
//        int []ans={-1,-1};
//
//        //check for the first occurence if target first
//        int start=search(nums,target,true);
//        int end=search(nums,target,false);
//        ans[0]=start;
//        ans[1]=end;
//        return  ans;
//    }
//    //this function just returns the index value of the taget
//    int search(int[] nums,int target, boolean findStartIndex){
//        int ans=-1;
//        int start=0;
//        int end=nums.length-1;
//        while(start<=end){
////            int mid=(start+end)/2;
//            int mid=start+(end-start)/2;
//            if(target<nums[mid]){
//                end=mid-1;
//
//
//            }
//            else if(target>nums[mid]){
//                start=mid+1;
//
//            }else{
//                ans=mid;
//                if(findStartIndex){
//                    end=mid-1;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//
//        }
//        return  ans;
//
//    }
//
//}

import java.io.*;
import java.util.*;

//public class leetcode {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        scan.close();
//
//        // Trim leading and trailing spaces and split the string using a regular expression
//        s = s.trim();
//
//        if (s.isEmpty()) {
//            // If the string is empty after trimming, no tokens
//            System.out.println(0);
//            return;
//        }
//
//        // Split based on non-alphabetic characters
//        String[] tokens = s.split("[^a-zA-Z]+");
//
//        // Print the number of tokens
//        System.out.println(tokens.length);
//
//        // Print each token
//        for (String token : tokens) {
//            System.out.println(token);
//        }
//    }
//}


//public class leetcode {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        scan.close();
//
//        // Trim leading and trailing spaces and split the string using a regular expression
//        s = s.trim();
//
//        if (s.isEmpty()) {
//            // If the string is empty after trimming, no tokens
//            System.out.println(0);
//            return;
//        }
//
//        // Split based on non-alphabetic characters
//        String[] tokens = s.split("[^a-zA-Z]+");
//
//        // Print the number of tokens
//        System.out.println(tokens.length);
//
//        // Print each token
//        for (String token : tokens) {
//            System.out.println(token);
//        }
//    }
//}



import java.util.Stack;

class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the expression
        for (char c : expression.toCharArray()) {
            if (c == ')') {
                // When we find a closing parenthesis, process the sub-expression
                Stack<Character> subExpr = new Stack<>();
                // Collect all characters in the current sub-expression until '('
                while (stack.peek() != '(') {
                    subExpr.push(stack.pop());
                }
                // Pop the '(' from the stack
                stack.pop();

                // Pop the operator (either '!', '&', or '|')
                char operator = stack.pop();

                // Evaluate the sub-expression and push the result back to the stack
                boolean result = evaluate(subExpr, operator);
                stack.push(result ? 't' : 'f');
            } else if (c != ',') {
                // Push all other characters except commas
                stack.push(c);
            }
        }

        // The result will be the only element left in the stack
        return stack.peek() == 't';
    }

    // Helper method to evaluate a sub-expression
    private boolean evaluate(Stack<Character> subExpr, char operator) {
        if (operator == '!') {
            // For NOT, we simply flip the boolean value of the single expression
            return subExpr.pop() == 'f'; // !f -> true, !t -> false
        } else if (operator == '&') {
            // For AND, we return true only if all sub-expressions are true
            boolean result = true;
            while (!subExpr.isEmpty()) {
                result &= (subExpr.pop() == 't');
            }
            return result;
        } else {
            // For OR, we return true if any sub-expression is true
            boolean result = false;
            while (!subExpr.isEmpty()) {
                result |= (subExpr.pop() == 't');
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Test cases
        System.out.println(solution.parseBoolExpr("&(|(f))"));    // Output: false
        System.out.println(solution.parseBoolExpr("|(f,f,f,t)")); // Output: true
        System.out.println(solution.parseBoolExpr("!(&(f,t))"));  // Output: true
    }
}
