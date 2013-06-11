package com.unrc.controllers;

import com.unrc.app.models.User;



public class UserController {

    public static void register(String email, String first_name, String last_name) {
              
        User user = User.createIt("email",email, "first_name", first_name, "last_name", last_name);
       
       user.saveIt();
    }
    
    public static void deRegister(int id){  
        User found = User.findById(id);
        if (found != null) {
           found.delete();
           System.out.println("User "+id+" borrado");
        }
        else{
            System.out.println("No se puede eliminar porque no esta");
        }
        
    }
    
     public static void modify (int id, String email, String first_name, String last_name) {
       
        User e = User.findById(id);
        if (e != null) {
            e.set("email", email, "first_name", first_name, "last_name", last_name);     
            System.out.println("User "+id+" modificado");
        }
        else {
            System.out.println("User "+id+" no encontrado");
        }
    }
     
}



