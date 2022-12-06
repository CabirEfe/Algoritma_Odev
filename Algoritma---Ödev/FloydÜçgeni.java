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
public class FloydÜçgeni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayır Sayısı Girniz: ");
        int ss = input.nextInt();
        int a = 1;
        
        for (int i = 1; i <= ss; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
             System.out.print(a);
             System.out.print(" ");
             a++;
            }
           System.out.println(" ");
        }
    }
    
}
