/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class AltınOran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Uzunluğu Giriniz: ");
        int uz = input.nextInt();
        double b = 2 * uz / (1 + Math.pow(5,0.5));
        double c = uz - b;
        System.out.println(b);
        System.out.println(c);
    }
    
}
