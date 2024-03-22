
package ProyectoTask.Task;

import java.util.Scanner;

public class Tarea {
    
    private String nombre;
    private boolean completada;
    
    public void agregarTarea()
    {
        String nombreTarea;
        int duracion;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la tarea: ");
        nombreTarea = lector.nextLine();
        if(siString(nombreTarea))
        {
        }
        else
        {
           throw new ArithmeticException("No es un String.");
        }
       
        System.out.print("Duracion de la tarea en horas: ");
        duracion = lector.nextInt();
        
    }
    
    public void menuOpciones ()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("""
                          |-------------------|
                          |        MENU       |
                          |-------------------|
                          |1. Agregar tarea   |
                          |2. Lista de tareas |
                          |3. Editar tarea    |
                          |4. Eliminar tarea  |
                          |5. Salir           |
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
