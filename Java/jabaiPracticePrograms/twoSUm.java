import java.util.Scanner;

public class twoSUm {
				
				class Solution {
    public int[] twoSum(int[] nums, int target) {
        int trial = 0;
        int[] result = new int[2]; // array of int initialization
        
        for(int i = 0; i < nums.length; i++) { //loops for first num
            for(int j = 0; j < nums.length; j++) { // loops for second num
                trial = nums[i] + nums[j]; // all add possible combination within the array

                if(trial == target && (i != j)) { //checks if trial matches the target sum then validates if both numbers are not on the same position in the array
                    result[0] = j; // this 2 print the jocation in thi array that produces the sum
                    result[1] = i;
                    break; // breaks the loop
                }
            }
        }
        return result; //return the int location that creates the sum
    }
}
				
				public static void main(String[] args) {
								
								Scanner sc = new Scanner(System.in);
								
								Array<Int> numbers = new Array<>();
								
								new Solution().twoSUm();
				}
}