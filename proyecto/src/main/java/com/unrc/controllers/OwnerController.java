/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.controllers;

import com.unrc.app.models.Owner;


public class OwnerController {

        public static void register(String first_name, String last_name, String city, String neighborhood, String street, String email) {
       
       
       Owner owner = Owner.createIt("first_name", first_name, "last_name", last_name, "city", city, "neighborhood",neighborhood, "street", street, "email", email);
       
       owner.saveIt();
    }
    
    public static void deRegister(int id){  
        Owner found = Owner.findById(id);
        if (found != null) {
           found.delete();
           System.out.println("Owner "+id+" borrado");
        }
        else{
            System.out.println("No se puede eliminar porque no esta");
        }
        
    }
}


