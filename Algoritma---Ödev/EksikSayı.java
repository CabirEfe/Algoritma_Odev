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
public class EksikSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;
        
        for (int i = 1; i <= sayi; i++) 
        {
         if(sayi%i == 0)
         {
          toplam += i;
         }    
        }
        if(2 * sayi > toplam)
        {
            int ek = (2 * sayi) - toplam;
            System.out.println("Eksiklik Miktarı = " + ek);
        }
        else
        {
         System.out.println("Girdiğiniz Sayı Eksik Sayı Değildir.");
        }
    }
    
}
