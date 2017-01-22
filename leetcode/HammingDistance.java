/**
 * Created by codeart on 17/1/22.
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int z = x ^ y;
        int result = 0;
        while (z > 0) {
            result += (z & 1);
            z = z >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4) + "");

        System.out.println(Integer.bitCount( 1 ^ 4));
    }

}
