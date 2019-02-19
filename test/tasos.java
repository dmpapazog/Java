import javax.swing.JOptionPane;

public class tasos extends JOptionPane{
    
    static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        
        String outputMessage = "Auto 8a dei3ei to munhma";
        String titlos = "O titlos tou para8urou";
        showMessageDialog(null, 
                          outputMessage, 
                          titlos, 
                          JOptionPane.ERROR_MESSAGE);
    }
    
}