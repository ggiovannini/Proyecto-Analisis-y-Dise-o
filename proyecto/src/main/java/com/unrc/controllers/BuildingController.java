package com.unrc.controllers;

import com.unrc.app.models.Building;
import org.javalite.activejdbc.Base;

public class BuildingController {
    
    public static void register(String type, String city, String neighborhood, String street, String price, String description, String sale, String rental, String owner_id) {
       
       
       Building building = Building.createIt("type", type, "city", city, "neighborhood",neighborhood, "street", street, "price", price, "description", description, "sale", sale, "rental", rental, "owner_id", owner_id);
       
       building.saveIt();
    }
    
    public static String deRegister(int id){  
        String a;
        Building found = Building.findById(id);
        if (found != null) {
           found.delete();
           a ="Building "+id+" borrada";
        }
        else{
            a = "No existe el inmueble";
        }
        return a;
        
    }
    
    public static String modify (int id, String type, String city, String neighborhood, String street, String price, String description, String sale, String rental, String owner_id) {
        String a ;
        Building e = Building.findById(id);
        if (e != null) {
            e.set("type", type, "city", city,"neighborhood", neighborhood, "street", street, "price", price, "description", description, "sale", sale, "rental", rental, "owner_id", owner_id).saveIt();
            a = "Building "+id+" modificado";
        }
        else {
            a = "Inmueble "+id+" no encontrado";
        }
        return a ;
    }
      
    
}

