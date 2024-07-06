import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        int[] nums = {10, 20, 5, 15, 25};

        int n = nums.length;
        PriorityQueue<Integer> largestElements = new PriorityQueue<>(4);
        PriorityQueue<Integer> smallestElements = new PriorityQueue<>(4, Collections.reverseOrder());
        if (n <= 4) {
            System.out.println(0);
        } else {

            for (int num : nums) {
                largestElements.offer(num);
                if (largestElements.size() > 4) {
                    largestElements.poll();
                }
                smallestElements.offer(num);
                if (smallestElements.size() > 4) {
                    smallestElements.poll();
                }
            }

//            for (int i = 0; i < 4; i++) {
//                min[i] = smallestElements.poll();
//            }
//            for (int i = 0; i < 4; i++) {
//                max[i] = largestElements.poll();
//            }
//            Arrays.sort(min);
//            Arrays.sort(max);

//            int[] combined = new int[8];
//            for (int i = 0; i < 4; ++i) {
//                combined[i] = smallestElements.poll();
//            }
//            for (int i = 4; i < 8; ++i) {
//                combined[i] = largestElements.poll();
//            }
//            nums = combined;
//            Arrays.sort(nums);

            List<Integer> minFour = new ArrayList<>(smallestElements);
            List<Integer> maxFour = new ArrayList<>(largestElements);

            Collections.sort(minFour);
            Collections.sort(maxFour);

            int score = Integer.MAX_VALUE;
            for(int i = 0; i < 4; i++){
                score = Math.min(score, maxFour.get(i) - minFour.get(i));
            }

            System.out.println(score);
        }

    }

}
