/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Ahorcado {

    public static String l1, l2, l3, l4;
    public static final String negro = "\u001B[0m";
    public static final String rojo = "\u001B[31m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5) + 1;
        switch (n) {
            case 1:
                l1 = "c";
                l2 = "a";
                l3 = "s";
                l4 = "a";
                break;
            case 2:
                l1 = "c";
                l2 = "a";
                l3 = "r";
                l4 = "a";
                break;
            case 3:
                l1 = "t";
                l2 = "a";
                l3 = "z";
                l4 = "a";
                break;
            case 4:
                l1 = "m";
                l2 = "a";
                l3 = "s";
                l4 = "a";
                break;
            case 5:
                l1 = "v";
                l2 = "a";
                l3 = "s";
                l4 = "o";
                break;
        }
        String la = "_", lb = "_", lc = "_", ld = "_";
        System.out.println("palabra de 4 letras: _ _ _ _");
        for (int i = 0; i < 5; i++) {
            String c = JOptionPane.showInputDialog("ingrese un caracer");
            if (l1.equals(c)) {
                la = l1;
            }
            if (l2.equals(c)) {
                lb = l2;
            }
            if (l3.equals(c)) {
                lc = l3;
            }
            if (l4.equals(c)) {
                ld = l4;
            }
            if (!la.equals("_") && !lb.equals("_") && !lc.equals("_") && !ld.equals("_")) {
                System.out.println("Adivinaste!");
                return;
            }
            System.out.println("palabra de 4 letras: " + la + " " + lb + " " + lc + " " + ld);
            System.out.println(" ____");
            System.out.println(" |  | (1er intento)");
            if (i > 0) {
                System.out.println(" |  0 (2do intento)");
            } else {
                System.out.println(" |");
            }
            if (i > 1) {
                System.out.println(" | --- (3er intento)");
            } else {
                System.out.println(" |");
            }
            if (i > 2) {
                System.out.println(" |  " + rojo + "| (4to intento)" + negro);
            } else {
                System.out.println(" |");
            }
            if (i > 3) {
                System.out.println(" | " + rojo + "| | (5to intento)" + negro);
            } else {
                System.out.println(" |");
            }
            System.out.println(
                    " |\n"
                    + "_|________");
        }
        System.out.println("Ahorcado!");
    }

}
