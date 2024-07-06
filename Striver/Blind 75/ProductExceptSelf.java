public class ProductExceptSelf {

//    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//    You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]
//    Example 2:
//
//    Input: nums = [-1,1,0,-3,3]
//    Output: [0,0,9,0,0]
//
//
//    Constraints:
//
//            2 <= nums.length <= 105
//            -30 <= nums[i] <= 30
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//
//    Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)


    public int[] productExceptSelf(int[] nums) {

//        ------------------Optimized solution but takes more space------------------
//
//        int n = nums.length;
//        int[] prefixProduct = new int[n];
//        int[] suffixProduct = new int[n];
//
//        int[] output = new int[n];
//
//        prefixProduct[0] = 1;
//        suffixProduct[n-1] = 1;
//        for(int i = 1; i < n; i++){
//            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
//        }
//        for(int i = n-2; i >= 0; i--){
//            suffixProduct[i] = suffixProduct[i+1] * nums[i+1];
//        }
//
//        for(int i = 0; i < n; i++){
//            output[i] = prefixProduct[i] * suffixProduct[i];
//        }
//
//        return output;


        int n = nums.length;
        int[] output = new int[n];
        output[0] = 1;
        int product = 1;

        for(int i = 1; i < n; i++){
            output[i] = output[i-1] * nums[i-1];
        }
        for(int i = n-2; i >= 0; i--){

            product *= nums[i+1];
            output[i] = output[i] * product;
        }
        
        return output;

    }
}
