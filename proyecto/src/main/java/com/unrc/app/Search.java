
package com.unrc.app;

import com.unrc.app.models.Building;
import java.util.List;

public class Search {
    
    public void searchBuilding (String city) {
        List<Building> lista = Building.where("city = ?", city);
        Building a;
        if (lista.size() > 0) {
            System.out.println("Inmuebles de " + city + ":");
            int i = 0;
            while (i < lista.size()) {
                System.out.println("--------------------------");
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String type = (String) a.get("type");
                String cit = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                Integer price = (Integer) a.get("price");
                String desc = (String) a.get("description");
                String sale = (String) a.get("sale");
                String rental = (String) a.get("rental");                
                System.out.println ("Id: "+id);
                System.out.println ("Tipe: "+type);
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
    
    
}
