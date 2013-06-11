
package com.unrc.controllers;

import com.unrc.app.models.Estate;
import org.javalite.activejdbc.Base;

public class EstateController {
    
    public static void register(String name, String city, String neighborhood, String street, String phone, String mail, String web_site) {
       
       
       Estate estate = Estate.createIt("name", name, "city", city, "neighborhood",neighborhood, "street", street, "phone", phone, "mail", mail, "web_site", web_site);
       
       estate.saveIt();
    }
    
    public static String deRegister(int id){  
        String a;
        Estate found = Estate.findById(id);
        if (found != null) {
           found.delete();
           a = ("Inmobiliaria "+id+" borrada");
        }
        else{
            a = "No existe ";
        }
        return a;
        
    }
    
     public static String modify (int id, String name, String city, String neighborhood, String street, String phone, String mail, String web_site) {
       String a;
        Estate e = Estate.findById(id);
        if (e != null) {
            e.set("name", name, "city", city, "neighborhood", neighborhood, "street", street, "phone", phone, "mail", mail, "web_site", web_site).saveIt();
            a = "Inmobiliaria "+id+" modificada";
        }
        else {
            a = "Inmobiliaria "+id+" no encontrada";
        }
        return a;
    }
}
