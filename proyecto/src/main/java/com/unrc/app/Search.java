
package com.unrc.app;

import com.unrc.app.models.Building;
import com.unrc.app.models.Estate;
import com.unrc.app.models.Owner;
import java.util.List;

public class Search {
    
    public static String searchBuilding (String city, String type) {
        List<Building> lista;
        String inm = "No se encontraron resultados";
        
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
                inm = "<p>Inmuebles de " + city + ":</p>";
            }
            else {
                inm = "<p>Inmuebles:</p>" ;
            }
            int i = 0;
            
            while (i < lista.size()) {
                inm = inm + "<p>--------------------------</p>";
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String ty = (String) a.get("type");
                String cit = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                String price = (String) a.get("price");
                String desc = (String) a.get("description");
                String sale = (String) a.get("sale");
                String rental = (String) a.get("rental");                
                inm = inm + "<p>Id: "+id+"</p>";
                inm = inm + "<p>Tipe: "+ty+"</p>";
                inm = inm + "<p>City: "+cit+"</p>";
                inm = inm + "<p>Neighborhood: "+neig+"</p>";
                inm = inm + "<p>Street: "+street+"</p>";
                inm = inm + "<p>Price: "+price+"</p>";
                inm = inm + "<p>Description: "+desc+"</p>";
                inm = inm + "<p>Sale: "+sale+"</p>";
                inm = inm + "<p>Rental: "+rental+"</p>";
                i ++;
            }
        }       
        return inm;
    }   
    
    public static String searchEstate (String city) {
        String inm = "No se encontraron resultados";
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
                inm = "<p>Inmuebles de " + city + ":</p>";
            }
            else {
                inm =  "Inmuebles:</p>" ;
            }
            int i = 0;
            while (i < lista.size()) {
                inm = inm + "<p>--------------------------</p>";
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String name = (String) a.get("name");
                String cit = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                String phone = (String) a.get("phone");
                String mail = (String) a.get("mail");
                String web = (String) a.get("web_site");
                                
                inm = inm + "<p>Id: "+id+"</p>";
                inm = inm + "<p>Name: "+name+"</p>";
                inm = inm + "<p>City: "+cit+"</p>";
                inm = inm + "<p>Neighborhood: "+neig+"</p>";
                inm = inm + "<p>Street: "+street+"</p>";
                inm = inm + "<p>Phone: "+phone+"</p>";
                inm = inm + "<p>Mail: "+mail+"</p>";
                inm = inm + "<p>Web site: "+web+"</p>";                
                i ++;
            }
        }
        return inm;
    }  
    
    public static String searchOwner (String city) {
        String inm = "No se encontraron resultados ";
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
                inm = "<p>DUeños de " + city + ":</p>";
            }
            else {
                inm = "<p>Dueños:</p>";
            }
            int i = 0;
            while (i < lista.size()) {
                inm = inm +"<p>--------------------------</p>";
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String fst = (String) a.get("first_name");
                String last = (String) a.get("last_name");
                String cit = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                String email = (String) a.get("email");
                inm = inm +"<p>Id: "+id+"</p>";
                inm = inm +"<p>First name: "+fst+"</p>";
                inm = inm +"<p>Last name: "+last+"</p>";
                inm = inm +"<p>Neighborhood: "+neig+"</p>";
                inm = inm +"<p>Street: "+street+"</p>";
                inm = inm +"<p>Email: "+email+"</p>";
                i ++;
            }
        }
        return inm;
    }
    
    
}
