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
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
        
        //creo tres inmuebles de prueba... el tipo y la direccion deben ser obligatorios, segun el SRS
        //en este caso, lo hice para que diera error si no estan esos campos
        
        Building building = Building.createIt("type", "house", "city", "Rio Cuarto", "neighborhood", "Banda Norte", "street", "Marcelo T. Alvear 241", "rental", "yes", "sale", "yes");
        Building building2 = Building.createIt("type", "farm", "city", "Rio Cuarto", "neighborhood", "Barrio Bimaco", "street", "Castelli 801", "rental", "no", "sale", "yes");
        Building building3 = Building.createIt("type", "department", "city", "La Carlota", "neighborhood", "Centro", "street", "San Martin 76", "rental", "yes", "sale", "no");
        
        //creo una inmobiliaria...
        Estate estate = Estate.createIt("name", "Estate1", "web_site", "www.estate1.com");
        
        //creo dos duenos...
        Owner owner = Owner.createIt("first_name", "Bruno", "last_name","Isoardi", "email", "brunoiso_2@hotmail.com");
        Owner owner2 = Owner.createIt("first_name", "Guido", "last_name","Giovannini", "email", "g.guidogiovannini.g@gmail.com");
        
        //creo otra inmobiliaria...
        Estate estate2 = Estate.createIt("name", "Estate2","web_site", "www.estate2.com");
        
        //esto es para las relaciones. Aca, a los duenos les asigno inmobiliarias...
        //las relaciones entre inmobiliarias y duenos de de N a N...
        
        // al dueno 1, le asigno una inmobiliaria
        owner.add(estate);
        
        //al dueno 1 le asigno otra inmobiliaria
        owner.add(estate2);
       
        
        //a la inmobiliaria2, le asigno el dueno 2
        estate2.add(owner2);
        
        //hasta aca, el dueno1 es cliente de la inmobiliaria 1 y 2
        //mientras que el dueno2 es cliente de solo la inmobiliaria 2, es decir,
        //la inmobiliaria 2 tiene dos clientes, el dueno 1 y el dueno 2...
        
        // las relaciones entre dueno e inmueble es de 1 a N...
        //al dueno1, le asigno el inmueble1
        owner.add(building);
        
        //al dueno2, le asigno el inmueble2
        owner2.add(building2);
        
        //al dueno2, le asigno el inmueble3, ya que el se puede ser dueeo de dos inmuebles
        owner2.add(building3);
        
        // hasta aca, cada inmueble tiene solo un dueno, como pide el SRS
        
        //y esto es lo que viene con el proyecto, la clase de ejemplo User
        User e = new User();
        e.set("email", "brunoiso@hotmail.com");
        e.set("first_name", "Bruno");
        e.set("last_name", "Isoardi");
        e.saveIt();
        
        System.out.println( "Hello World!" );
 
    }
}
