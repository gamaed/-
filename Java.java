package org.example;

import javax.swing.*;

public class Java extends JFrame {

    public static void Ui() {
        JFrame frame = new JFrame("Кастом Элемент");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CustomButton customPanel = new CustomButton();
        customPanel.setBounds(0, 0, 400, 400);
        frame.setLayout(null);
        frame.add(customPanel);

        // Кнопка
        JButton button = new JButton("Add");
        button.setBounds(150, 150, 100, 30);
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Ui();
    }
}

