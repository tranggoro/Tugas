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
class hidup{
    String nama;
}
class ikan extends hidup{
}
class burung extends hidup{
    
}
public class Mhidup {
    public static void main(String[] args) {
    
    ikan ikan1 = new ikan();
    ikan1.nama="ikan hidup di air";
    System.out.println("binatang"+ikan1.nama);
    
    burung burung1 = new burung();
    burung1.nama="burung hidup di darat";
    System.out.println("binatang"+burung1.nama);
    }
    
}