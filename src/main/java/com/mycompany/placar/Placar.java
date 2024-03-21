/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.placar;

/**
 *
 * @author fernanda.nunes
 */
import javax.swing.*;

public class Placar extends JFrame{
    JLabel tela = new JLabel();
    public  Placar(){
        tela.setBounds(150,150,150,150);
        
    }

    public static void main(String[] args) {
        Placar form=new Placar();
        form.setBounds(0,0,600,400);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        form.setTitle("Placar");
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}
