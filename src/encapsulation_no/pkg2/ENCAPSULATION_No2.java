/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation_no.pkg2;

/**
 *
 * @author LENOVO
 */
public class ENCAPSULATION_No2 {

    
    public static void main(String[] args) {
        
        Bola a = new Bola();       
        a.setjarijari(5);
        System.out.println("Jari-jari           = "+a.getjarijari());
        System.out.println("Diameter            = "+a.showDiameter()); 
        System.out.println("Luas Permukaan Bola = "+a.showLuasPermukaan());
        System.out.println("Volume              = "+a.showVolume());
       
    }
    
}
