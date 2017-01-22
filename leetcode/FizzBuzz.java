import java.util.ArrayList;
import java.util.List;

/**
 * Created by codeart on 17/1/22.
 */
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>(n);
        int x = 0;
        while (x++ < n) {
            if (x % 15 == 0) {
                result.add("FizzBuzz");
            } else if (x % 5 == 0) {
                result.add("Buzz");
            } else if (x % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(x + "");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
