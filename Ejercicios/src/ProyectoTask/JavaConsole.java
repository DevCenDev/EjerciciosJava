
package ProyectoTask;

import ProyectoTask.Task.Tarea;
import java.util.Scanner;

public class JavaConsole {
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        Tarea task = new Tarea();
        Tarea quitar = new Tarea();
        int opcion;
        
        do{
            System.out.println();
            task.menuOpciones();
            System.out.print("Ingrese una opcion: ");
            opcion = escribir.nextInt();
            System.out.println();
        switch (opcion) {
            case 1:
                task.agregarTarea();
                break;
            case 2:
                quitar.remover(task);
                break;
            case 3:
                task.verLista(task);
                
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
            }
        }
        while(opcion != 4);
        
        
        
        
        
        
        
        
    }
  

}
