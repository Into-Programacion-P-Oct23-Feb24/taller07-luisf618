/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author lcord
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        int denominador = 1;
        double suma = 1.0;
        int negativo;
        String signo;
        String cadenaFinal = "";
        cadenaFinal = String.format("%s1",cadenaFinal);
        while(denominador<=13){
            if(contador%2==0){
                signo = "+";
                negativo = 1;
            }else{
                signo = "-";
                negativo = -1;
            }
            denominador = denominador + 2;
            contador = contador + 1;
            cadenaFinal = String.format("%s %s 1/%s",
                    cadenaFinal,
                    signo,
                    denominador);
            suma = suma + negativo * 1 / (double)denominador;
            
        }
        System.out.printf("%s\nResultado de la suma: %f\n",
                cadenaFinal,
                suma);
    }
    
}
