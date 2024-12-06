//@author: Daiane Tararam

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteLambda {
    public static void main(String[] args) {
        //Criando uma thread sem função lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).run();

        //Criando uma thread com função lambda
        new Thread(() -> System.out.println("Olá mundo!")).run();

        //JButton sem função lambda
        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Olá mundo!");
            }
        });

        //JButton com função lambda
        JButton jButton2 = new JButton();
        jButton2.addActionListener(e -> System.out.println("Olá mundo!"));


    }
}
