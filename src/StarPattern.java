import java.util.Scanner;

/**
 * StarPattern
 */
public class StarPattern {

    public void printCharacters(String character, int times){
        for(int i = 0; i < times; i++) {
            System.out.print(character);
        }
        System.out.println();
    }

    public void printSpaces(int times) {
        for(int i = 0; i < times; i++) {
            System.out.print(' ');
        }
    }

    public static void main(String[] args) {
        int widestRow,
            index,
            times = 1;
        Scanner userInput = new Scanner(System.in);
        String character;

        StarPattern obj = new StarPattern();
        
        System.out.print("Enter the character to print: ");
        character = userInput.nextLine();
        System.out.print("Enter the position of the widest row: ");
        widestRow = userInput.nextInt();

        // Print first half of the pattern
        for(index = 1; index <= widestRow; index++) {
            obj.printSpaces(widestRow-index);
            obj.printCharacters(character, times);
            times+=2;
        }
        
        // Print second half
        times-=4;
        for(index = widestRow - 1; index > 0; index--) {
            obj.printSpaces(widestRow-index);
            obj.printCharacters(character, times);
            times-=2;
        }


        userInput.close();
    }

}