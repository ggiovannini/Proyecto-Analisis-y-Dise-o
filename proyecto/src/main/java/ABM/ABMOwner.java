
package ABM;

import com.unrc.app.models.Owner;
import com.unrc.controllers.OwnerController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABMOwner {
    
    public void insertar () throws IOException {   
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el nombre");
        String nombre = leer.readLine();
        System.out.println("Ingrese el apellido");
        String ape = leer.readLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = leer.readLine();
        System.out.println("Ingrese el barrio");
        String barrio = leer.readLine();
        System.out.println("Ingrese la calle");
        String calle = leer.readLine();
        System.out.println("Ingrese el mail");
        String mail = leer.readLine();
         
        OwnerController.register (nombre, ape, ciudad, barrio, calle, mail); 
    }
    
    public void eliminar () throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el Id del dueño que desea eliminar");
        Integer id =Integer.parseInt(leer.readLine());          
        OwnerController.deRegister(id);
    }
    
    public void modificar () throws IOException {
        
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el id del usuario que desea modificar");
        Integer id =Integer.parseInt(leer.readLine());
        Owner e = Owner.findById(id);
        if (e != null) {
            System.out.println("Ingrese el nombre");
            String nombre = leer.readLine();
            System.out.println("Ingrese el apellido");
            String ape = leer.readLine();
            System.out.println("Ingrese la ciudad");
            String ciudad = leer.readLine();
            System.out.println("Ingrese el barrio");
            String barrio = leer.readLine();
            System.out.println("Ingrese la calle");
            String calle = leer.readLine();
            System.out.println("Ingrese el mail");
            String mail = leer.readLine();
         
            OwnerController.modify (id, nombre, ape, ciudad, barrio, calle, mail);
        }
        else {
            System.out.println ("No existe ninguna usuario con ese Id");
        }
        
        
    }
}
