
package ABM;

import com.unrc.app.models.Estate;
import com.unrc.controllers.EstateController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABMEstate {
    
    public void insertar () throws IOException {   
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el nombre");
        String nombre = leer.readLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = leer.readLine();
        System.out.println("Ingrese el barrio");
        String barrio = leer.readLine();
        System.out.println("Ingrese la calle");
        String calle = leer.readLine();
        System.out.println("Ingrese el telefono");
        String tel = leer.readLine();
        System.out.println("Ingrese el mail");
        String mail = leer.readLine();
        System.out.println("Ingrese el sitio web");
        String web = leer.readLine();
         
        EstateController.register (nombre, ciudad, barrio, calle, tel, mail, web);
    }
    
    public void eliminar () throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el Id de la inmobiliaria que desea eliminar");
        Integer id =Integer.parseInt(leer.readLine());          
        EstateController.deRegister(id);
    }
    
    public void modificar () throws IOException {
        
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el id de la inmobiliaria que desea modificar");
        Integer id =Integer.parseInt(leer.readLine());
        Estate e = Estate.findById(id);
        if (e != null) {
            System.out.println("Ingrese el nombre");
            String nombre = leer.readLine();
            System.out.println("Ingrese la ciudad");
            String ciudad = leer.readLine();
            System.out.println("Ingrese el barrio");
            String barrio = leer.readLine();
            System.out.println("Ingrese la calle");
            String calle = leer.readLine();
            System.out.println("Ingrese el telefono");
            String tel = leer.readLine();
            System.out.println("Ingrese el mail");
            String mail = leer.readLine();
            System.out.println("Ingrese el sitio web");
            String web = leer.readLine();  
            EstateController.modify (id, nombre, ciudad, barrio, calle, tel, mail, web);    
        }
        else {
            System.out.println ("No existe ninguna inmobiliaria con ese Id");
        }
        
        
    }
}
