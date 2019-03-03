import java.util.Arrays;

/**
 * arrays
 */
public class arrays {

    public static void main(String[] args) {
        int[] a1 = new int[10];
        a1[0] = 0;
        Arrays.fill(a1, 2);
        System.out.println("a[0] = " + a1[0]);
        System.out.println("Length of a1 = " + a1.length);

    }
}