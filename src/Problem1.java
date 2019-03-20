/**
 * Problem1
 */
public class Problem1 {

    public static void main(String[] args) {
        int width = 6, height = 6;

        for (int row = 0; row < height; row++) {
            for (int number = 0; number <= row; number++) {
                System.out.print(number + 1);
            }
            for (int star = row + 1; star < width; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}