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
public class BinomAçilimiKullanarakBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Lütfen Üssü Giriniz:");
        int üs = input.nextInt();
        
        double e = (double)Math.pow((1 + sayi / üs),üs);
        System.out.println(e);
        
        
            
        
    }
    
}
