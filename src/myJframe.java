import java.awt.*;
import javax.swing.*;

/**
 * jframe
 */
public class myJframe {
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JLabel label;

    public myJframe()
    {
        gui();
    }

    public void gui()
    {
        // Set frame.
        frame = new JFrame("Creativity tutorials.");
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set panel.
        panel = new JPanel();
        panel.setBackground(Color.YELLOW);

        // Set button.
        button1 = new JButton("Test");

        // Set label.
        label = new JLabel("This is a test label.");

        // Add the button and the
        // label to the panel.
        panel.add(button1);
        panel.add(label);

        // Add the panel
        // to the frame.
        frame.add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) 
    {
        new myJframe();
    }
}