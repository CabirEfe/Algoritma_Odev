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
public class PalindromSayılarToplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Basamak Sayısını Giriniz: ");
        int bs = input.nextInt();
        System.out.println(Math.pow(9  * 10,((bs - 1)/2)));
    }
    
}
