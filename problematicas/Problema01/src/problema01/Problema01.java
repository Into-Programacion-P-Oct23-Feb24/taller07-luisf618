/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author lcord
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombre;
        String posicion;
        int edad;
        double estatura;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double sumaEstaturas = 0;
        int contador = 0;
        double promedioEdad;
        double promedioEstatura;
        String cadenaEdad = "";
        
        
        do{
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            contador = contador + 1;
            cadenaReporte = String.format("%s%d. %s -%s-, edad %d,"
                    + " estatura %.2f\n",
                    cadenaReporte,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            cadenaEdad = String.format("%s%d\n",cadenaEdad,edad);
            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }while(bandera);
        promedioEdad = (double)sumaEdades / contador;
        promedioEstatura = (double)sumaEstaturas / contador;
        cadenaReporte = String.format("Listado de Jugadores\n%sListado de Edades"
                + "\n%sPromedio de edades: %.1f\nPromedio de estaturas: %.2f\n",
                cadenaReporte,
                cadenaEdad,
                promedioEdad,
                promedioEstatura);
        System.out.printf("%s\n", cadenaReporte);
    }
}
