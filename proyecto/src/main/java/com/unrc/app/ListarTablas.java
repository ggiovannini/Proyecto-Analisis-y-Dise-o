package com.unrc.app;

import com.unrc.app.models.Building;
import com.unrc.app.models.Estate;
import com.unrc.app.models.Owner;
import java.util.List;


public class ListarTablas {
    
    public static String listarDuenos () {
        String inm = "La tabla esta vacia";
        List<Owner> lista;
        lista = Owner.where("");
        Owner a;
        if (lista.size() > 0) {
            int i = 0;
            inm = "";
            while (i < lista.size()) {
                inm = inm +"<p>--------------------------</p>";
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String fst = (String) a.get("first_name");
                String last = (String) a.get("last_name");
                String city = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                String email = (String) a.get("email");
                inm = inm +"<p>Id: "+id+"</p>";
                inm = inm +"<p>First name: "+fst+"</p>";
                inm = inm +"<p>Last name: "+last+"</p>";
                inm = inm +"<p>City: "+city+"</p>";
                inm = inm +"<p>Neighborhood: "+neig+"</p>";
                inm = inm +"<p>Street: "+street+"</p>";
                inm = inm +"<p>Email: "+email+"</p>";
                i ++;
            }
        }
        return inm;
    }
    
    public static String listarInmuebles () {
        String inm = "La tabla esta vacia";
        List<Building> lista;
        lista = Building.where("");
        Building a;
        if (lista.size() > 0) {
            int i = 0;
            inm = "";
            while (i < lista.size()) {
                inm = inm +"<p>--------------------------</p>";
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String type = (String) a.get("type");                
                String city = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                Double price = (Double) a.get("price");
                String desc = (String) a.get("description");
                String sale = (String) a.get("sale");
                String rental = (String) a.get("rental");
                Integer owner_id = (Integer) a.get("owner_id");
                inm = inm +"<p>Id: "+id+"</p>";
                inm = inm +"<p>Type: "+type+"</p>";
                inm = inm +"<p>City: "+city+"</p>";
                inm = inm +"<p>Neighborhood: "+neig+"</p>";
                inm = inm +"<p>Street: "+street+"</p>";
                inm = inm +"<p>Price: "+price+"</p>";
                inm = inm +"<p>Description: "+desc+"</p>";
                inm = inm +"<p>Sale: "+sale+"</p>";
                inm = inm +"<p>Rental: "+rental+"</p>";
                inm = inm +"<p>Owner Id: "+owner_id+"</p>";
                i ++;
            }
        }
        return inm;
    }
    
    public static String listarInmobiliaria () {
        String inm = "La tabla esta vacia";
        List<Estate> lista;
        lista = Estate.where("");
        Estate a;
        if (lista.size() > 0) {
            int i = 0;
            inm = "";
            while (i < lista.size()) {
                inm = inm +"<p>--------------------------</p>";
                a =  lista.get(i);
                Integer id = (Integer) a.get("id");
                String name = (String) a.get("name");
                String city = (String) a.get("city");
                String neig = (String) a.get("neighborhood");
                String street = (String) a.get("street");
                String phone = (String) a.get("phone");
                String email = (String) a.get("mail");
                String web_site = (String) a.get("web_site");
                inm = inm +"<p>Id: "+id+"</p>";
                inm = inm +"<p>First Name: "+name+"</p>";
                inm = inm +"<p>Last City: "+city+"</p>";
                inm = inm +"<p>Neighborhood: "+neig+"</p>";
                inm = inm +"<p>Street: "+street+"</p>";
                inm = inm +"<p>Phone: "+phone+"</p>";
                inm = inm +"<p>Email: "+email+"</p>";
                inm = inm +"<p>Web site: "+web_site+"</p>";
                i ++;
            }
        }
        return inm;
    }
}
