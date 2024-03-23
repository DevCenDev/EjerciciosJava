
package ProyectoTask.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {
    private String nombreTarea;
    private int cantHoras;
    private final ArrayList<Tarea> listaTask = new ArrayList<>();

    
    public Tarea(String nombreTarea, int cantHoras)
    {
        this.cantHoras = cantHoras;
        this.nombreTarea = nombreTarea;
        
    }
    public Tarea()
    {
        
    }
    

    public String getNombreTarea() {
        return nombreTarea;
    }

    public int getCantHoras() {
        return cantHoras;
    }
    
    
    
    public void agregarTarea()
    {
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
    
    @Override
    public String toString()
    {
        return "Tarea: " + getNombreTarea() + " || " +
                "Horas: " + getCantHoras();
    }
    
    
    
      public void verLista(Tarea list)
    {
        Tarea newTarea = new Tarea(nombreTarea, cantHoras);
        listaTask.add(newTarea);
        
        for(int i = 0; i < listaTask.size(); i++)
        {
            System.out.println(listaTask.get(i));
        }
        
  
     
    }
    
     

    
    

        

    
    
    
    
    

}
