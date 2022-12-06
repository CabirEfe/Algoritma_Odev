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
public class MaclaurinSerisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir X Sayısı Giriniz: ");
        int x = input.nextInt();
        System.out.println("Lütfen Terim Sayısını Giriniz: ");
        int ts = input.nextInt();
        
        double e = 0;
        int ft = 1;
        
        for (int i = 1; i <= ts; i++) 
        {
         e += (double)Math.pow(x,i) / (ft *= i);
        }
        System.out.println(1 + e);
    }
    
}
