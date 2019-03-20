import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

/**
 * myActionListener
 */
public class myActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton button1;

    public myActionListener() {
        frame();
    }

    public void frame() {
        frame = new JFrame("Action listener.");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        button1 = new JButton("Action listener.");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Action listener is created.");
            }
        });

        panel.add(button1);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new myActionListener();
    }
}