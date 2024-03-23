
package ProyectoTask;

import ProyectoTask.Task.ListTask;
import ProyectoTask.Task.Tarea;
import java.util.Scanner;

public class JavaConsole {
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        Tarea task = new Tarea();
        ListTask lisTareas = new ListTask();
        int opcion;
        
        do{
            task.menuOpciones();
            System.out.print("Ingrese una opcion: ");
            opcion = escribir.nextInt();
        switch (opcion) {
            case 1:
                task.agregarTarea();
                break;
            case 2:
                break;
            case 3:
                lisTareas.verLista(task);
            
                
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
