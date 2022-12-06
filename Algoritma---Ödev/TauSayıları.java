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
public class TauSayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Üst Sınır Belirleyiniz. ");
        int üst = input.nextInt();
        int sayac = 0;
        int i = 1;
        while(i < üst)
        {
            for (int j = 1; j <= i; j++) 
            {
             if(i%j == 0)
             {
              sayac++;
             }    
            }
            if(i%sayac == 0)
            {
            System.out.println(i);
            }
            i++;
            sayac = 0;
        }
        
    }
    
}
