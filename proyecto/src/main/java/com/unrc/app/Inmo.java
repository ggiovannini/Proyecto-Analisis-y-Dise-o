package com.unrc.app;

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
        
          Owner o = new Owner();
          o.set("email", "brunoiso_2@hotmail.com");
          o.saveIt();
//        User e = new User();
//        e.set("email", "brunoiso@hotmail.com");
//        e.set("first_name", "Bruno");
//        e.set("last_name", "Isoardi");
//        e.saveIt();
        
        System.out.println( "Hello World!" );
 
    }
}
