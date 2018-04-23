package com.xuxianda.test03.lambda;

import javax.swing.*;

/**
 * Created by Xianda Xu on 2018/4/22.
 */
public class Main extends JFrame {

    public Main(){
        JButton jb = new JButton();
        this.setBounds(300,300,300,300);
        jb.setName("click");
        /*jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click");
            }
        });*/
        jb.addActionListener(e -> {
            System.out.println("asdfasdfasdfasdf");
        });
        this.add(jb);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }

}
