package com.unrc.controllers;

import com.unrc.app.models.Building;
import org.javalite.activejdbc.Base;

public class BuildingController {
    
    public static void register(String type, String city, String neighborhood, String street, String price, String description, String sale, String rental, String owner_id) {
       
       
       Building building = Building.createIt("type", type, "city", city, "neighborhood",neighborhood, "street", street, "price", price, "description", description, "sale", sale, "rental", rental, "owner_id", owner_id);
       
       building.saveIt();
    }
    
    public static void deRegister(int id){  
        Building found = Building.findById(id);
        if (found != null) {
           found.delete();
           System.out.println("Building "+id+" borrada");
        }
        else{
            System.out.println("No se puede eliminar porque no esta");
        }
        
    }
}

