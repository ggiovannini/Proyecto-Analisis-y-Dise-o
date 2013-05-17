package com.unrc.app;

import com.unrc.app.models.Building;
import com.unrc.app.models.Estate;
import com.unrc.app.models.Owner;
import com.unrc.app.models.User;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inmo {
    public static void main( String[] args )
    {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "guido");
        
        Building building = Building.createIt("type", "house", "city", "Rio Cuarto", "neighborhood", "Banda Norte", "street", "Marcelo T. Alvear 241", "rental", "yes", "sale", "yes");
        Building building2 = Building.createIt("type", "farm", "city", "Rio Cuarto", "neighborhood", "Barrio Bimaco", "street", "Castelli 801", "rental", "no", "sale", "yes");
        Building building3 = Building.createIt("type", "department", "city", "La Carlota", "neighborhood", "Centro", "street", "San Martin 76", "rental", "yes", "sale", "no");
        
        Estate estate = Estate.createIt("name", "Estate1", "web_site", "www.estate1.com");
        
        Owner owner = Owner.createIt("first_name", "Bruno", "last_name","Isoardi", "email", "brunoiso_2@hotmail.com");
        Owner owner2 = Owner.createIt("first_name", "Guido", "last_name","Giovannini", "email", "g.guidogiovannini.g@gmail.com");
        
        Estate estate2 = Estate.createIt("name", "Estate2","web_site", "www.estate2.com");
        
        
        owner.add(estate);
        owner.add(estate2);
        estate2.add(owner2);
        owner.add(building);
        owner2.add(building2);
        owner2.add(building3);

        User e = new User();
        e.set("email", "brunoiso@hotmail.com");
        e.set("first_name", "Bruno");
        e.set("last_name", "Isoardi");
        e.saveIt();
        
        System.out.println( "Hello World!" );
 
    }
}
