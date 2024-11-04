package ItemListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemListener extends JFrame {

    private JComboBox proficiencyComboBox;
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JLabel languageLabel;
    private JPanel pMain;
    private JLabel proficiencyLabel;

    ItemListener() {
        cCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cCheckBox.isSelected()) {
                    languageLabel.setText(languageLabel.getText() + " " + cCheckBox.getText());
                } else {
                    String currentText = languageLabel.getText();
                    languageLabel.setText(currentText.replace(" " + cCheckBox.getText(), "")
                            .replace(cCheckBox.getText(), ""));
                }
            }
        });

        cppCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cppCheckBox.isSelected()) {
                    languageLabel.setText(languageLabel.getText() + " " + cppCheckBox.getText());
                } else {
                    String currentText = languageLabel.getText();
                    languageLabel.setText(currentText.replace(" " + cppCheckBox.getText(), "")
                            .replace(cppCheckBox.getText(), ""));
                }
            }
        });

        cSharpCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cSharpCheckBox.isSelected()) {
                    languageLabel.setText(languageLabel.getText() + " " + cSharpCheckBox.getText());
                } else {
                    String currentText = languageLabel.getText();
                    languageLabel.setText(currentText.replace(" " + cSharpCheckBox.getText(), "")
                            .replace(cSharpCheckBox.getText(), ""));
                }
            }
        });


        javaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (javaCheckBox.isSelected()) {
                    languageLabel.setText(languageLabel.getText() + " " + javaCheckBox.getText());
                } else {
                    String currentText = languageLabel.getText();
                    languageLabel.setText(currentText.replace(" " + javaCheckBox.getText(), "")
                            .replace(javaCheckBox.getText(), ""));
                }
            }
        });

        pythonCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pythonCheckBox.isSelected()) {
                    languageLabel.setText(languageLabel.getText() + " " + pythonCheckBox.getText());
                } else {
                    String currentText = languageLabel.getText();
                    languageLabel.setText(currentText.replace(" " + pythonCheckBox.getText(), "")
                            .replace(pythonCheckBox.getText(), ""));
                }
            }
        });

        proficiencyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proficiencyLabel.setText(proficiencyLabel.getText() + " " + proficiencyComboBox.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        ItemListener s = new ItemListener();
        s.setContentPane(s.pMain);
        s.setSize(350,350);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }

}
