
package ejercicios.Ejercicio01;

public class SerieFibonacci {
    public static void main(String[] args) {
        // Mostrar los 10 primeros numeros de la serie de fibonacci contando desde el 0.
        
        int serie [] = new int [10];
        
        serie[0] = 0;
        serie [1] = 1;
        
        System.out.print(serie[0] + " " + serie[1] + " ");
        
        for(int i = 2; i < serie.length; i++)
        {
            int resultado = serie[i - 1] + serie[i - 2];
            System.out.print(resultado);
        }
        
        
        
    }

}
