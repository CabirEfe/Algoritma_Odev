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
public class JonhWallis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Terim Sayısını Giriniz: ");
        int tr = input.nextInt();
        int a;
        double c = 1;
        for (int i = 1; i <= tr; i++) 
        {
         a = 4 * i * i;
         c *= (double)a / (a - 1);
        }
        System.out.println(2 * c);
    }
    
}
