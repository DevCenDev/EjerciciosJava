
package ProyectoTask.Task;

import java.util.ArrayList;

public class ListTask {
    private ArrayList<Tarea> listaTask = new ArrayList<>();
    
    public String verLista(Tarea list)
    {
        listaTask.add(list);
        
     for(Tarea array : listaTask)
     {
         System.out.println(array);
     }
        return null;
        
    }
   
    






    
    
    
    
    
    }
    

