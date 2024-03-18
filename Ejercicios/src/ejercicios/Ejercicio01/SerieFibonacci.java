
package ejercicios.Ejercicio01;

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        // Mostrar los n primeros numeros de la serie de fibonacci contando desde el 0.
        Scanner lectura = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese el valor de n: ");
        n = lectura.nextInt();
        
        int serie [] = new int [n];
        
        serie[0] = 0;
        serie [1] = 1;
        
        System.out.print(serie[0] + " " + serie[1] + " ");
        
        for(int i = 2; i < serie.length; i++)
        {
            serie[i] = serie[i - 1] + serie[i - 2];
            System.out.print(serie[i] + " ");
        }
        
        
        
    }

}
