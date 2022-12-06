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
public class SonsuzKesir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Basamak Sayısını Giriniz: ");
        int bs = input.nextInt();
        
        double a = 1;
        
        for (int i = 1; i <= bs; i++) 
        {
          a =(double) 2 + 1 / a;   
        }
        System.out.println(1 + 1 / a);
    }
    
}
