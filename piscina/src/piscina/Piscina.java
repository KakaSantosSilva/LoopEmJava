/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piscina;

/**
 *
 * @author santo
 */
public class Piscina {

    public static void main(String[] args) {
        int x  = 0;
        
        while( x < 4){
            
            if( x < 1 ){
                System.out.print("a ");
                System.out.println("noise");
                
            }
                   x = x + 2;
            if( x > 1 ){
                System.out.println("annoys");
            }
                   x = x - 1;
            if ( x == 1){
                System.out.print("an ");
            }
                  x = x + 1;
            if (x  > 0 ){
                System.out.println("oyster");
            }
            System.out.println(" ");
            x = x + 2;
        }
        
    }
    
}
