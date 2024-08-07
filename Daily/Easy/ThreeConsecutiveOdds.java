package Easy;

public class ThreeConsecutiveOdds {

//    Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
//
//    Example 1:
//    Input: arr = [2,6,4,1]
//    Output: false
//    Explanation: There are no three consecutive odds.
//
//    Example 2:
//    Input: arr = [1,2,34,3,4,5,7,23,12]
//    Output: true
//    Explanation: [5,7,23] are three consecutive odds.
//
//
//    Constraints:
//
//    1 <= arr.length <= 1000
//    1 <= arr[i] <= 1000

    public boolean threeConsecutiveOdds(int[] arr) {
        // StringBuilder binaryString = new StringBuilder();
        // for (int num : arr) {
        //     binaryString.append(num % 2);
        // }
        // return binaryString.toString().contains("111");

        int odds = 0;
        for (int i = 0; i < arr.length && odds < 3; i++) {
            odds = (arr[i] % 2 == 1) ? odds + 1 : 0;
        }
        return odds == 3;
    }
}
