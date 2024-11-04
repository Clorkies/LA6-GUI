package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JPanel pMain;
    private JButton checkYearButton;
    private JTextField yearTextField;

    public boolean isLeapYear(int year) {
        return year % 4 == 0 & year % 100 != 0 || year % 400 == 0;
    }

    LeapYearChecker() {
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextField.getText());

                if (isLeapYear(year)) {
                    JOptionPane.showMessageDialog(null, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a Leap Year!");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker ly = new LeapYearChecker();
        ly.setContentPane(ly.pMain);
        ly.setTitle("Leap Year Checker");
        ly.setSize(300,250);
        ly.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ly.setLocationRelativeTo(null);
        ly.setVisible(true);
    }
}
