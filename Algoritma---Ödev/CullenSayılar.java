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
public class CullenSayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir N Sayısı Giriniz: ");
        int a = input.nextInt();
        
        for (int i = 1; i <= a; i++) 
        {
            System.out.println(Math.pow(i * 2,i + 1));    
        }
    }
    
}
