/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author lcord
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 2;
        int suma = 1;
        do{
            System.out.println(numero);
            suma = suma + 2;
            numero = numero + suma;
            
        }while(numero<=37);
    }
    
}
