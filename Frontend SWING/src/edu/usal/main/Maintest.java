package edu.usal.main;

import edu.usal.vista.consola.VISTAGENERAL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maintest {

    private JPanel mainScreen;
    private JButton XD;

    public Maintest() {
        XD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Funciona XDXD");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Maintest");
        frame.setContentPane(new Maintest().mainScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
