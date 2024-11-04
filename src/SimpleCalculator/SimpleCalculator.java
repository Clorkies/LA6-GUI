package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {

    private JPanel pMain;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JComboBox cbOperations;
    private JButton btnCompute;

    SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1, num2, result=0;
                double divRes = 0.0;
                num1 = Integer.parseInt(tfNumber1.getText());
                num2 = Integer.parseInt(tfNumber2.getText());
                switch (cbOperations.getSelectedIndex()) {
                    case 0:
                        result = num1+num2;
                        lblResult.setText(result + "");
                        break;
                    case 1:
                        result = num1-num2;
                        lblResult.setText(result + "");
                        break;
                    case 2:
                        result = num1*num2;
                        lblResult.setText(result + "");
                        break;
                    case 3:
                        divRes = num1/(num2 + 0.0);
                        lblResult.setText(divRes + "");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Enter a valid operation");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator c = new SimpleCalculator();
        c.setContentPane(c.pMain);
        c.setTitle("Simple Calculator");
        c.setSize(700,250);
        c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
