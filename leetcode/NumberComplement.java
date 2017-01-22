/**
 * Created by codeart on 17/1/22.
 */
public class NumberComplement {

    public static int numberComplement(int x) {
//        int t = x;
//        int i = 1;
//        while (t > 0) {
//            t >>= 1;
//            i <<= 1;
//        }
//        return x ^ (i - 1);
        return x ^ ((Integer.highestOneBit(x) << 1) - 1);
    }

    public static void main(String[] args) {
        System.out.println(numberComplement(1));

    }



}
