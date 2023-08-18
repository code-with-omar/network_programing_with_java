package OmarFaruk;

import javax.swing.*;
import java.awt.event.*;

public class BillGeneration extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;

    BillGeneration() {
        // Initialize the JFrame and its components
        setTitle("Food Ordering System");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize JLabel
        l = new JLabel("Food Ordering System");
        l.setBounds(50, 50, 300, 20);
        add(l);

        // Initialize JCheckBoxes
        cb1 = new JCheckBox("Pizza @ 100");
        cb1.setBounds(100, 100, 150, 20);
        add(cb1);

        cb2 = new JCheckBox("Burger @ 30");
        cb2.setBounds(100, 150, 150, 20);
        add(cb2);

        cb3 = new JCheckBox("Tea @ 10");
        cb3.setBounds(100, 200, 150, 20);
        add(cb3);

        // Initialize JButton
        b = new JButton("Order");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);
        add(b);

        // Make the JFrame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "Selected items:\n";

        if (cb1.isSelected()) {
            amount += 100;
            msg += "Pizza: 100\n";
        }
        if (cb2.isSelected()) {
            amount += 30;
            msg += "Burger: 30\n";
        }
        if (cb3.isSelected()) {
            amount += 10;
            msg += "Tea: 10\n";
        }

        msg += "-----------------\n";
        msg += "Total: " + amount;

        // Display the order summary in a JOptionPane
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new BillGeneration();
    }
}
