package org.example;

import javax.swing.*;

public class ÁreaPerímetro_Rectángulo {

    public static void main (String[] args){
//Diseñar un algoritmo que solicite al usuario la base y la altura de un rectángulo calcule su área
//y su perímetro, e imprima los resultados.

        int base, altura, area, perímetro;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base de su rectángulo"));

        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura de su rectángulo"));

        area = base*altura;
        perímetro = 2*(base+altura);

        JOptionPane.showMessageDialog(null, "El área de su rectángulo es: "+area+"\n"
        +"El perímetro de su rectángulo es: "+perímetro);
    }
}
