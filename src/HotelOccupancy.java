import javax.swing.JOptionPane;

public class HotelOccupancy extends JOptionPane{

    
    private static final long serialVersionUID = 1L; 

    public static void main(String[] args) {
        String userInput;
        int numberOfFloors;
        int numberOfRooms;
        int occupiedRooms;
        int numberOfVaccantRooms;
        int totalNumberOfRooms         = 0;
        int totalNumberOfOccupiedRooms = 0;
        int totalNumberOfVaccantRooms  = 0;
        int errorIndex                 = 0;
        double occupancyRate;
        String outputMessage;

        do{
            if (errorIndex > 0) {
                userInput = showInputDialog(null,
                                            "A floor number less than 1 is not acceptable.\n" + 
                                            "Please enter the number of floors of the hotel.", 
                                            "input", 
                                            ERROR_MESSAGE);
        
            } else {
                userInput = showInputDialog("Please enter the number of floors of the hotel.");
            }
            numberOfFloors = Integer.parseInt(userInput);
            errorIndex++;
        } while(numberOfFloors < 1);


        for (int floor = 1; floor <= numberOfFloors; floor++) {
            errorIndex = 0;
            do{
                if (errorIndex > 0) {
                    userInput = showInputDialog(null,
                                            "Rooms less than 10 are unacceptable.\n" + 
                                            "How many rooms are on floor " + floor + '?',
                                            "input", 
                                            ERROR_MESSAGE);
                } else {
                    userInput = showInputDialog("How many rooms are on floor " + floor + '?');
                }
                numberOfRooms = Integer.parseInt(userInput);
                errorIndex++;
            }while(numberOfRooms < 10);

            userInput            = showInputDialog("How many rooms on " + floor + "st floor are occupied?");
            occupiedRooms        = Integer.parseInt(userInput);
            numberOfVaccantRooms = numberOfRooms - occupiedRooms;

            totalNumberOfRooms         += numberOfRooms;
            totalNumberOfOccupiedRooms += occupiedRooms;
            totalNumberOfVaccantRooms  += numberOfVaccantRooms;
        }

        occupancyRate = (double) totalNumberOfOccupiedRooms / (double) totalNumberOfRooms;
        outputMessage = String.format("Total number of rooms: %d\n" +
                                      "Total number of occupied rooms: %d\n" + 
                                      "Total number of vaccant rooms: %d\n" +
                                      "Occupancy rate: %.3f", 
                                      totalNumberOfRooms,
                                      totalNumberOfOccupiedRooms,
                                      totalNumberOfVaccantRooms,
                                      occupancyRate);
        showMessageDialog(null, 
                          outputMessage, 
                          "Results", 
                          JOptionPane.PLAIN_MESSAGE);
    }
}