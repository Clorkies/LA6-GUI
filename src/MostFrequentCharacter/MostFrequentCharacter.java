package MostFrequentCharacter;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.*;

public class MostFrequentCharacter extends JFrame {
    private JPanel pMain;
    private JTextArea textArea;
    private JLabel frequentCharLabel;

    public static void updateMostFreqChar(JTextArea ta, JLabel jl) {
        String text = ta.getText().toLowerCase().replaceAll(" ", "");
        int freqCnt = 0;
        char freqChar = ' ';

        HashMap<Character, Integer> freqs = new HashMap<>();
        for (Character c: text.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            if (freqCnt < freqs.get(c)) {
                freqCnt = freqs.get(c);
                freqChar = c;
            }
        }

        jl.setText("The most frequent character is : " + freqChar);
    }

    public MostFrequentCharacter() {
        textArea.setLineWrap(true);                // Enable line wrapping
        textArea.setWrapStyleWord(true);           // Wrap at word boundaries
        textArea.setSize(350, 80);

        textArea.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateMostFreqChar(textArea, frequentCharLabel);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateMostFreqChar(textArea, frequentCharLabel);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateMostFreqChar(textArea, frequentCharLabel);
            }
        });

    }

    public static void main(String[] args) {
        MostFrequentCharacter j = new MostFrequentCharacter();
        j.setContentPane(j.pMain);
        j.setTitle("Most Frequent Character");
        j.setSize(500, 300);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
}
