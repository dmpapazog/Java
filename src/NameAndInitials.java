/**
 * NameAndInitials
 */
public class NameAndInitials {

    public static void main(String[] args) {
        String firstName = "Jim";
        String middleName = "Chris";
        String lastName = "Papazoglou";

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName + '\n');

        System.out.println("First name initial character: " + firstInitial);
        System.out.println("Middle name initial character: " + middleInitial);
        System.out.println("Last name initial character: " + lastInitial);
    }
}