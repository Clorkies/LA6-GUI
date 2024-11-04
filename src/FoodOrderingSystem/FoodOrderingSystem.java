package FoodOrderingSystem;

import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel pMain;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    FoodOrderingSystem() {
        JCheckBox[] foods = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total_price = 0.0;
                Map<String, Integer> prices = Map.ofEntries(
                        Map.entry("Pizza", 100), Map.entry("Burger", 80), Map.entry("Fries", 65),
                        Map.entry("SoftDrinks", 55), Map.entry("Tea", 50), Map.entry("Sundae", 40)
                );

                for (JCheckBox f : foods) {
                    if (f.isSelected() && prices.containsKey(f.getText())) {
                        total_price += prices.get(f.getText());
                    }
                }

                if (rb5.isSelected()) total_price *= 0.95;
                else if (rb10.isSelected()) total_price *= 0.90;
                else if (rb15.isSelected()) total_price *= 0.85;

                JOptionPane.showMessageDialog(null, String.format("Total price is Php %.2f", total_price));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem s = new FoodOrderingSystem();
        s.setContentPane(s.pMain);
        s.setSize(500,600);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }
}
