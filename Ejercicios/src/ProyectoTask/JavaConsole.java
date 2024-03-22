
package ProyectoTask;

import ProyectoTask.Task.Tarea;
import java.util.Scanner;

public class JavaConsole {
    public static void main(String[] args) {
        Scanner escribirStr = new Scanner(System.in);
        Scanner escribir = new Scanner(System.in);
        Tarea tarea1 = new Tarea();
        
        tarea1.menuOpciones();
        System.out.print("Ingrese una opcion: ");
        int opcion = escribir.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre de la tarea: ");
                String nombreTask = escribirStr.nextLine();
                
                System.out.print("Ingrese la cantidad de horas: ");
                int cantHoras = escribir.nextInt();
                
                if(cantHoras < 0)
                {
                    while(true)
                    {
                        System.out.println("no puede ingresar numeros menores o iguales a 0.\n");
                        System.out.print("Ingrese nuevamente la cantidad de horas: ");
                        cantHoras = escribir.nextInt();
                        if(cantHoras > 0 && cantHoras != 0)
                        {
                            break;
                        }
                    }
                }
                System.out.println("Guardado exitosamente!");
                tarea1.agregarTarea(nombreTask, cantHoras);
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
