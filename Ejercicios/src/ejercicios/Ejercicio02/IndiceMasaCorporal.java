
package ejercicios.Ejercicio02;

import java.util.Scanner;

public class IndiceMasaCorporal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        float peso, altura;
        
        System.out.print("Ingrese su peso en Kg: ");
        peso = lectura.nextFloat();
        
        System.out.print("Ingrese la altura en m: ");
        altura = lectura.nextFloat();
        
        // Se usa la clase math para elevar al cuadrado la variable altura
        
        float imc = (float) (peso / Math.pow(altura, 2));
        
        System.out.printf("""
                          El indice de masa corporal es: %.2f
                          """, imc);
        
        
    }

}
