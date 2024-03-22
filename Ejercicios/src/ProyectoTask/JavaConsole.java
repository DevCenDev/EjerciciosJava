
package ProyectoTask;

import ProyectoTask.Task.Tarea;
import java.util.Scanner;

public class JavaConsole {
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        Tarea tarea1 = new Tarea();
        
        tarea1.menuOpciones();
        System.out.print("Ingrese una opcion: ");
        int opcion = escribir.nextInt();
        
        switch (opcion) {
            case 1:
                tarea1.agregarTarea();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
                
            default:
                throw new AssertionError();
        }
        
        
        
        
        
        
        
        
    }

}
