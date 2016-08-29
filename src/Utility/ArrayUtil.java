package Utility;

/**
 * Created by chetan on 29/8/16.
 */
public class ArrayUtil {
    public static void printArray(int[] anArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(anArray[i]);
        }
        System.out.println(sb.toString());
    }
}
