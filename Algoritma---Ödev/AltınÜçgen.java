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
public class AltınÜçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Üçgenin Kısa Kenarını Giriniz: ");
        int kenar = input.nextInt();
        double oran = kenar * (1 + Math.pow(5,0.5)) / 2;
        System.out.println(kenar);
        System.out.println(oran);
        System.out.println(oran);
    }
    
}
