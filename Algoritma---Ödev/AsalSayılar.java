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
public class AsalSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int alt;
        int üst;
        do{
         System.out.println("Lütfen Üst Sınırı Belirleyiniz: ");
         üst = input.nextInt();
        }while( üst < 0);
        
        
        for (int sayi = 2; sayi < üst; sayi++) 
        {
         int kontrol = 0;
            for (int i = 2; i < sayi; i++) 
            {
             if(sayi%i == 0)
             {
              kontrol = 1;
              break;
             }    
            }
            if(kontrol == 0)
            {
                System.out.println(sayi);
            }
        }
            
        
     
    }
    
}
