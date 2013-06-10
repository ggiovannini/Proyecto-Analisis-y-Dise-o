
package com.unrc.app;

import com.unrc.app.models.Building;
import com.unrc.app.models.Estate;
import com.unrc.app.models.Owner;
import java.util.List;

public class Search {
    
    public void searchBuilding (String city, String type) {
        List<Building> lista;
        
        if ((city != null) && (type != null)) {
            lista = Building.where("city = ? AND type = ?", city, type);
        }
        else {
            if (city != null) {
                lista = Building.where("city = ?", city);
            }
            else {
                if (type != null) {
                    lista = Building.where("type = ?", type);
                }
                else {
                    lista = Building.where("");
                }
            }            
        }
        Building a;
        if (lista.size() > 0) {
            if (city != null) {
                System.out.println("Inmuebles de " + city + ":");
            }
            else {
                System.out.println ("Inmuebles:" );
            }
            int i = 0;
            while (i < lista.size()) {
                System.out.println("--------------------------");
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String ty = (String) a.get("type");
                String cit = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                Integer price = (Integer) a.get("price");
                String desc = (String) a.get("description");
                String sale = (String) a.get("sale");
                String rental = (String) a.get("rental");                
                System.out.println ("Id: "+id);
                System.out.println ("Tipe: "+ty);
                System.out.println ("City: "+cit);
                System.out.println ("Neighborhood: "+neig);
                System.out.println ("Street: "+street);
                System.out.println ("Price: "+price);
                System.out.println ("Description: "+desc);
                System.out.println ("Sale: "+sale);
                System.out.println ("Rental: "+rental);
                i ++;
            }
        }
        else {
            System.out.println ("No hay inmuebles disponibles en "+city);
        }
    }   
    
    public void searchEstate (String city) {
        List<Estate> lista;
        if (city != null) {
            lista = Estate.where("city = ?", city);
        }
        else {
            lista = Estate.where("");
        }
        Estate a;
        if (lista.size() > 0) {
            if (city != null) {
                System.out.println("Inmuebles de " + city + ":");
            }
            else {
                System.out.println ("Inmuebles:" );
            }
            int i = 0;
            while (i < lista.size()) {
                System.out.println("--------------------------");
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String name = (String) a.get("name");
                String cit = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                Integer phone = (Integer) a.get("phone");
                String mail = (String) a.get("mail");
                String web = (String) a.get("web_site");
                                
                System.out.println ("Id: "+id);
                System.out.println ("Name: "+name);
                System.out.println ("City: "+cit);
                System.out.println ("Neighborhood: "+neig);
                System.out.println ("Street: "+street);
                System.out.println ("Phone: "+phone);
                System.out.println ("Mail: "+mail);
                System.out.println ("Web site: "+web);                
                i ++;
            }
        }
        else {
            System.out.println ("No hay inmuebles disponibles en "+city);
        }
    }  
    
    public void searchOwner (String city) {
        List<Owner> lista;
        if (city != null) {
            lista = Owner.where("city = ?", city);
        }
        else {
            lista = Owner.where("");
        }
        Owner a;
        if (lista.size() > 0) {
            if (city != null) {
                System.out.println("DUeños de " + city + ":");
            }
            else {
                System.out.println ("Dueños:" );
            }
            int i = 0;
            while (i < lista.size()) {
                System.out.println("--------------------------");
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String fst = (String) a.get("first_name");
                String last = (String) a.get("last_name");
                String cit = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                String email = (String) a.get("email");
                System.out.println ("Id: "+id);
                System.out.println ("First name: "+fst);
                System.out.println ("Last name: "+last);
                System.out.println ("Neighborhood: "+neig);
                System.out.println ("Street: "+street);
                System.out.println ("Email: "+email);
                i ++;
            }
        }
        else {
            System.out.println ("No hay inmuebles disponibles en "+city);
        }
    }
    
    
}
