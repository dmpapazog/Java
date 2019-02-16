import javax.swing.JFrame;

public class HotelOccupancy2 {

    public static void main(String[] args) {
        String userInput;
        int numberOfFloors;
        int numberOfRooms;
        int occupiedRooms;
        int numberOfVaccantRooms;
        int totalNumberOfRooms = 0;
        int totalNumberOfOccupiedRooms = 0;
        int totalNumberOfVaccantRooms = 0;
        int errorIndex = 0;
        double occupancyRate;
        String outputMessage;

        do{
            if (errorIndex > 0) {
                userInput = JOptionPane.showInputDialog("A floor number less than 1 is not acceptable.\nPlease enter the number of floors of the hotel.");
            } else {
                userInput = JOptionPane.showInputDialog("Please enter the number of floors of the hotel.");
            }
            numberOfFloors = Integer.parseInt(userInput);
            errorIndex++;
        }while(numberOfFloors < 1);

        for (int floor = 1; floor <= numberOfFloors; floor++) {
            errorIndex = 0;
            do{
                if (errorIndex > 0) {
                    userInput = JOptionPane.showInputDialog("Rooms less than 10 are unacceptable.\nHow many rooms are on floor " + floor + '?');
                } else {
                    userInput = JOptionPane.showInputDialog("How many rooms are on floor " + floor + '?');
                }
                numberOfRooms = Integer.parseInt(userInput);
                errorIndex++;
            }while(numberOfRooms < 10);

            userInput = JOptionPane.showInputDialog("How many rooms on " + floor + "st floor are occupied?");
            occupiedRooms = Integer.parseInt(userInput);
            numberOfVaccantRooms = numberOfRooms - occupiedRooms;

            totalNumberOfRooms += numberOfRooms;
            totalNumberOfOccupiedRooms += occupiedRooms;
            totalNumberOfVaccantRooms += numberOfVaccantRooms;
        }

        occupancyRate = (double) totalNumberOfOccupiedRooms / (double) totalNumberOfRooms;
        outputMessage = String.format("Total number of rooms: %d\n" +
                                      "Total number of occupied rooms: %d\n" + 
                                      "Total number of vaccant rooms: %d\n" +
                                      "Occupancy rate: %.1f", 
                                      totalNumberOfRooms,
                                      totalNumberOfOccupiedRooms,
                                      totalNumberOfVaccantRooms,
                                      occupancyRate);
        JOptionPane.showMessageDialog(null, outputMessage);
    }
}