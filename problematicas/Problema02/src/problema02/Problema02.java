/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 2;
        int suma = 0;
        while(numero<=110){
            System.out.println(numero);
            suma = suma + 2;
            numero = numero + suma + 2;
            
        }
    }
    
}
