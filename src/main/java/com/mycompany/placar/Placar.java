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
import java.awt.event.*;

public class Placar extends JFrame {

    private final JTextField nomeTorneio;
    private final JButton salvaTorneio;

    public Placar() {

        nomeTorneio = new JTextField("Escreva o nome do torneio");
        nomeTorneio.setBounds(55, 200, 400, 30);
        add(nomeTorneio);
        
        salvaTorneio=new JButton("Salvar");
        salvaTorneio.setBounds(170, 250, 100, 30);
        salvaTorneio.addActionListener((ActionListener) this);
        //privado();
    }
    
    /*private void privado(){
        salvaTorneio.addActionListener(this);
    }*/
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==salvaTorneio){
            String Torneio = nomeTorneio.getText();
            JOptionPane.showMessageDialog(this, "Clicou");
        }
    }

    public static void main(String[] args) {
        Placar form = new Placar();
        form.setBounds(0, 0, 600, 400);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        form.setTitle("Placar");
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}
