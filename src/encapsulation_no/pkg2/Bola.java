/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation_no.pkg2;

import static java.lang.Math.PI;

public class Bola {
    //set jarijari
   private double jarijari;
   
   //gatter 
   public double getjarijari(){
   return jarijari;
   }
   //setter
   public void setjarijari(double jari){
       jarijari=jari;
   }
   //method diameter
   public double showDiameter (){
   return jarijari+jarijari;
   }
   //method Luas Permukaan
   public double showLuasPermukaan(){
   return 4* PI *jarijari*jarijari;
   }
   //method volume
   public double showVolume(){
   return 4/3 * PI * jarijari*jarijari*jarijari;
   }
   
   
   
   
   
   
   
   
   
   
 
}
