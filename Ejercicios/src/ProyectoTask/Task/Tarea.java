
package ProyectoTask.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {
    private String nombreTarea;
    private int cantHoras;
    private final ArrayList<Tarea> listaTask = new ArrayList<>();

    
    public void agregarTarea()
    {
        Scanner lector = new Scanner(System.in);
       
        
        System.out.print("Ingrese el nombre de la tarea: ");
        nombreTarea = lector.nextLine();
        
        if (!siString(nombreTarea) || nombreTarea.isEmpty()) {
            throw new IllegalArgumentException("Nombre de tarea no válido.");
        }
            System.out.print("Ingrese la cantidad de horas: ");
            cantHoras = lector.nextInt();
            
            if(cantHoras <= 0)
            {
                throw new IllegalArgumentException("Cantidad de horas no válida.");
            }
            Tarea nuevaTarea = new Tarea();
            nuevaTarea.nombreTarea = nombreTarea;
            nuevaTarea.cantHoras = cantHoras;
            listaTask.add(nuevaTarea);
            
        
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
    
    @Override
    public String toString()
    {
                return 
                "Tarea: " + nombreTarea + " || " +
                "Horas: " + cantHoras;
    }
    
    public void verLista()
    {
        for(int i = 0; i < listaTask.size(); i++)
        {
            System.out.println("ID: " + i + " || " + listaTask.get(i));
        }
    }
    
    
    
      
      
      public void remove()
      {
          Scanner leer = new Scanner(System.in);
          System.out.print("Ingrese el ID para borrar: ");
          int index = leer.nextInt();
          
          if(index >= 0 && index < listaTask.size())
          {
              listaTask.remove(index);
              System.out.println("Se elimino correctamente.");
          }
          else
          {
              throw new IllegalArgumentException("Ingrese un indice valido.");
          }
          
          
      }
    
      
    
     

    
    

        

    
    
    
    
    

}
