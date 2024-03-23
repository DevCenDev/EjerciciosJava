
package ProyectoTask.Task;

import java.util.Scanner;

public class Tarea {
    
    public void agregarTarea()
    {
        Scanner lector = new Scanner(System.in);
        
        String nombreTarea;
        int cantHoras;
        
        System.out.print("Ingrese el nombre de la tarea: ");
        nombreTarea = lector.nextLine();
        
        if(siString(nombreTarea))
        {
        }
        else
        {
           throw new ArithmeticException("No es un String.");
        }
        System.out.print("Ingrese la cantidad de horas: ");
        cantHoras = lector.nextInt();
        
    }
    
    public void menuOpciones ()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("""
                          |-------------------|
                          |        MENU       |
                          |-------------------|
                          |1. Agregar tarea   |
                          |2. Eliminar tarea  |
                          |3. Lista de tareas |
                          |4. Salir           |
                          |-------------------|
                           """);
    }
            
        
    static boolean siString(String retorna)
     {
	 for (char value : retorna.toCharArray()) {
            if (!Character.isDigit(value)) {
                return true;
            }
        }
        return false; 
     }
    
     

    
    

        

    
    
    
    
    

}
