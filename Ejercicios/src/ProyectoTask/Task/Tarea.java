
package ProyectoTask.Task;

import java.util.Scanner;

public class Tarea {
    
    private String nombre;
    private boolean completada;
    
    public void agregarTarea(String nombreTarea, int duracion)
    {
        Scanner lector = new Scanner(System.in);
        if(siString(nombreTarea))
        {
        }
        else
        {
           throw new ArithmeticException("No es un String.");
        }
        
        
       
        
    }
    
    public void menuOpciones ()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("""
                          |-------------------|
                          |        MENU       |
                          |-------------------|
                          |1. Agregar tarea   |
                          |2. Editar tarea    |
                          |3. Eliminar tarea  |
                          |4. Lista de tareas |
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
