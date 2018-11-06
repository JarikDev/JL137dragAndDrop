package com;

import javax.swing.*;
import java.awt.*;

public class DragAndDropLesson {
    static JPanel jPanel=new JPanel();
    static JFrame jFrame=getFrame();

    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);
        JTextField jTextField=new JTextField(10);
        JTextField jTextField1=new JTextField(10);
        jTextField.setDragEnabled(true);
        jTextField1.setDragEnabled(true);
        jPanel.add(jTextField);
        jPanel.add(jTextField1);
        jTextField.revalidate();

    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 500);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        return jFrame;

    }
}
