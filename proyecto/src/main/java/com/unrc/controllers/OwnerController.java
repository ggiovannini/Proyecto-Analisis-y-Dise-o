package com.unrc.controllers;


import com.unrc.app.models.Owner;


public class OwnerController {

        public static void register(String first_name, String last_name, String city, String neighborhood, String street, String email) {
       
       
       Owner owner = Owner.createIt("first_name", first_name, "last_name", last_name, "city", city, "neighborhood",neighborhood, "street", street, "email", email);
       
       owner.saveIt();
    }
    
  public static String deRegister(int id){
        String res = "";
        Owner found = Owner.findById(id);
        if (found != null) {
           found.delete();
           res = "El dueno "+id+" borrado" ;
        }
        else{
           res = "El dueno no existe";
           
        }
        return res;
    }
    
     public static String modify (int id, String first_name, String last_name, String city, String neighborhood, String street, String email) {
        String res;
        Owner e = Owner.findById(id);
        if (e != null) {
            e.set("first_name", first_name, "last_name", last_name, "city", city, "neighborhood", neighborhood, "street", street, "email", email).saveIt();     
            res = "Dueno "+id+" modificado";
        }
        else {
            res = "El dueno "+id+" no existe";
        }
        return res;
    }
     
}


