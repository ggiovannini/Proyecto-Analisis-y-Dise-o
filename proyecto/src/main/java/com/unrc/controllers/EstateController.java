
package com.unrc.controllers;

import com.unrc.app.models.Estate;
import org.javalite.activejdbc.Base;

public class EstateController {
    
    public static void register(String name, String city, String neighborhood, String street, String phone, String mail, String web_site) {
       
       
       Estate estate = Estate.createIt("name", name, "city", city, "neighborhood",neighborhood, "street", street, "phone", phone, "mail", mail, "web_site", web_site);
       
       estate.saveIt();
    }
    
    public static void deRegister(int id){  
        Estate found = Estate.findById(id);
        if (found != null) {
           found.delete();
           System.out.println("Estate "+id+" borrada");
        }
        else{
            System.out.println("No se puede eliminar porque no esta");
        }
        
    }
}
