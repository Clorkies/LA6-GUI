package KeyEventActivity;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class KeyEventActivity extends JFrame {
    private JTextArea editableTextArea;
    private JTextArea nonEditableTextArea;
    private JPanel pMain;

    public KeyEventActivity() {
        editableTextArea.setLineWrap(true);
        editableTextArea.setWrapStyleWord(true);
        editableTextArea.setEditable(true);
//        editableTextArea.setSize(50, 150);
        nonEditableTextArea.setLineWrap(true);
        nonEditableTextArea.setWrapStyleWord(true);
        nonEditableTextArea.setEditable(false);
//        editableTextArea.setSize(50, 150);

        editableTextArea.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTextInputs(editableTextArea, nonEditableTextArea);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTextInputs(editableTextArea, nonEditableTextArea);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTextInputs(editableTextArea, nonEditableTextArea);
            }
        });

    }

    public static void updateTextInputs(JTextArea ta1, JTextArea ta2) {
        String text = ta1.getText();
        String toDisplay = "";
        String vowels = "aeioi";

        for (Character c: text.toCharArray()) {
            String temp = Character.toLowerCase(c) + "";
            if (vowels.contains(temp)) {
                toDisplay += temp.toUpperCase();
            } else {
                toDisplay += temp;
            }
        }
        ta2.setText(toDisplay);
    }

    public static void main(String[] args) {
        KeyEventActivity s = new KeyEventActivity();
        s.setContentPane(s.pMain);
        s.setSize(700, 350);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
    }
}
