package com.unrc.app;


import com.unrc.app.models.Owner;
import com.unrc.controllers.OwnerController;
import html.ABMOwner;
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
        
       
        get(new Route("/menu/") {
            @Override
            public Object handle(Request request, Response response) {
                    
                                
            return Menu.menuPrinc ();
                
            }
        });
        
        get(new Route("/abminmueble/") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuAbmInmueble();
                
            }
        });
        
         get(new Route("/abminmobiliaria/") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuAbmInmobiliaria();
                
            }
        });
         
          get(new Route("/abmdueno/") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuAbmDueno();
                
            }
        });
          
           get(new Route("/buscar/") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuBuscar();
                
            }
        });


        
        

        
        
        Spark.get(new Route("/insertardueno/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMOwner.register();			
	    	}
	});

	Spark.post(new Route ("/insertardueno/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        OwnerController.register(request.queryParams("first_name"), request.queryParams("last_name"),request.queryParams("city"), request.queryParams("neighborhood"),request.queryParams("street"),request.queryParams("email"));
                        Base.close();
                        return "El dueno ha sido agregado exitosamente";	
		}
   	});
    
    
   Spark.get(new Route("/eliminardueno/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMOwner.deRegister();			
	    	}
	});

	Spark.post(new Route ("/eliminardueno/"){
	@Override
		public Object handle(Request request, Response response) {
                        response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = OwnerController.deRegister(Integer.parseInt(request.queryParams("owner_id")));
                        Base.close();
                        return message;	
		}
   	});
    }    

}
