/**
 * Created by codeart on 17/1/22.
 */
public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] array) {
        int max = 0, tmp = 0;
        for (int i : array) {
            max = Math.max(max, i == 0 ? tmp = 0 : ++tmp);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 0, 1, 1, 1, 0};
        System.out.println(maxConsecutiveOnes(array));
    }

}
