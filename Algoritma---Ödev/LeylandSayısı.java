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
public class LeylandSayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir x Sayısı Giriniz: ");
        int x = input.nextInt();
        System.out.println("Lütfen Bir y Sayısı Giriniz: ");
        int y = input.nextInt();
        
        for (int i = 2; i <= x; i++) 
        {
            for (int j = 2; j <= y; j++) 
            {
                System.out.println(Math.pow(i,j) + Math.pow(j,i));    
            }
    
        }
    }
    
}
