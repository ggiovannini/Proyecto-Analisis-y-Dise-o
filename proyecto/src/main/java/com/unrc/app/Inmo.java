package com.unrc.app;


import java.io.IOException;
import html.Menu;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;
import spark.*;

public class Inmo {
    
    public static void main( String[] args ) throws IOException
    {
        
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
        get(new Route("/menu") {
            @Override
            public Object handle(Request request, Response response) {
                    
                                
            return Menu.menuPrinc ();
                
            }//http://localhost:4567/hello
        });
        
        get(new Route("/abminmueble") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuAbmInmueble();
                
            }//http://localhost:4567/hello
        });
        
         get(new Route("/abminmobiliaria") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuAbmInmobiliaria();
                
            }//http://localhost:4567/hello
        });
         
          get(new Route("/abmdueno") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuAbmDueño();
                
            }//http://localhost:4567/hello
        });
          
           get(new Route("/buscar") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuBuscar();
                
            }//http://localhost:4567/hello
        });


        
        

        
        
    
    
    }    
}
