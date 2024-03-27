import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrangeLargeValue {
    public static void main(String[] args) {
        Integer[] input = {54, 546, 548, 60};
        Arrays.sort(input,Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (int i=0;i<input.length;i++){
            result.append(input[i]);
        }
        System.out.println(result);
    }
}
