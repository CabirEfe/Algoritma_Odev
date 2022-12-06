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
public class HilbertSayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int sayi = input.nextInt();
        int temp;
        int sayac = 0;
        for (int i = 0; i < sayi + 1; i++) 
        {
         temp = 4 * i + 1;
         
          if(temp == sayi)
         {
          sayac++;      
         }
        }
        if(sayac == 0)
        {
         System.out.println(sayi + " Bir Hilbirt Sayısı Değildir.");
        }
        else
        {
         System.out.println(sayi + " Bir Hilbirt Sayısıdır.");
        }
    }
    
}
