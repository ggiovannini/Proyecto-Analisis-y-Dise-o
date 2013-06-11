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
           res = "Owner "+id+" borrado";
        }
        else{
           res = "No se puede eliminar porque no esta";
           
        }
        return res;
    }
    
     public static void modify (int id, String first_name, String last_name, String city, String neighborhood, String street, String email) {
       
        Owner e = Owner.findById(id);
        if (e != null) {
            e.set("first_name", first_name, "last_name", last_name, "city", city, "neighborhood", neighborhood, "street", street, "email", email);     
            System.out.println("Owner "+id+" modificado");
        }
        else {
            System.out.println("Owner "+id+" no encontrado");
        }
    }
     
}


