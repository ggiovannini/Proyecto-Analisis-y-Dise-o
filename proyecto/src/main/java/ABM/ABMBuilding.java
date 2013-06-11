
package ABM;

import com.unrc.app.models.Building;
import com.unrc.controllers.BuildingController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABMBuilding {
    
    public void insertar () throws IOException {   
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el tipo");
        String tipo = leer.readLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = leer.readLine();
        System.out.println("Ingrese el barrio");
        String barrio = leer.readLine();
        System.out.println("Ingrese la calle");
        String calle = leer.readLine();
        System.out.println("Ingrese el precio");
        String precio = leer.readLine();
        System.out.println("Ingrese la descripcion");
        String desc = leer.readLine();
        System.out.println("Esta en venta?");
        String venta = leer.readLine();
        System.out.println("Esta en alquiler?");
        String alquiler = leer.readLine();
        System.out.println("Ingrese el id del dueño"); 
        String id_dueño = leer.readLine();               
         
        BuildingController.register (tipo, ciudad, barrio, calle, precio, desc, venta, alquiler, id_dueño);
    }
    
    public void eliminar () throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el Id del inmueble que desea eliminar");
        Integer id =Integer.parseInt(leer.readLine());          
        BuildingController.deRegister(id);
    }
    
    public void modificar () throws IOException {
        
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el id del inmueble que desea modificar");
        Integer id =Integer.parseInt(leer.readLine());
        Building e = Building.findById(id);
        if (e != null) {
            System.out.println("Ingrese el tipo");
            String tipo = leer.readLine();
            System.out.println("Ingrese la ciudad");
            String ciudad = leer.readLine();
            System.out.println("Ingrese el barrio");
            String barrio = leer.readLine();
            System.out.println("Ingrese la calle");
            String calle = leer.readLine();
            System.out.println("Ingrese el precio");
            String precio = leer.readLine();
            System.out.println("Ingrese la descripcion");
            String desc = leer.readLine();
            System.out.println("Esta en venta?");
            String venta = leer.readLine();
            System.out.println("Esta en alquiler?");
            String alquiler = leer.readLine();
            System.out.println("Ingrese el id del dueño"); 
            String id_dueño = leer.readLine();              
            BuildingController.modify (id, tipo, ciudad, barrio, calle, precio, desc, venta, alquiler, id_dueño);    
        }
        else {
            System.out.println ("No existe ningun inmueble con ese Id");
        }
        
        
    }
}
