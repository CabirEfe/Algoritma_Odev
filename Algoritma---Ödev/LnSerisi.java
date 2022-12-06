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
public class LnSerisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int sayi = input.nextInt();
        
        double ln = 0;
        
        for (int i = 1; i <= sayi; i++) 
        {
         ln += (double)1 / (i * (i + 1));   
        }
        System.out.println(ln);
    }
    
}
