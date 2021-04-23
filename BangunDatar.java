/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author trian
 */
import java.util.Scanner;
public class BangunDatar {

    public static void main(String[] args) {
        int s;
        double luas;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("==================================");
        System.out.println("      MENGHITUNG LUAS PERSEGI     ");
        System.out.println("==================================");
        System.out.println("");
        s =input.nextInt();
        
        luas = s*s;
        System.out.println("luas persegi adalah : "+luas+"cm2");
    }
    
}