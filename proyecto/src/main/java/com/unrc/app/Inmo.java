package com.unrc.app;



import com.unrc.controllers.BuildingController;
import com.unrc.controllers.EstateController;
import com.unrc.controllers.OwnerController;
import html.ABMBuilding;
import html.ABMEstate;
import html.ABMOwner;
import html.SearchMenu;
import com.unrc.app.ListarTablas;
import java.io.IOException;
import html.Menu;

import org.javalite.activejdbc.Base;


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

           get(new Route("/listar/") {
            @Override
            public Object handle(Request request, Response response) {
                return Menu.menuListar();
                
            }
        });

        
        

        //----------------------------------------- ABM Owner -----------------------------------------------------//
        
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
                        return "El dueno ha sido agregado exitosamente" + "<p><a href='/abmdueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>" ;
                                	
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
                        return message + "<p><a href='/abmdueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
    
    Spark.get(new Route("/modificardueno/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMOwner.modify();			
	    	}
	});

	Spark.post(new Route ("/modificardueno/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = OwnerController.modify(Integer.parseInt(request.queryParams("owner_id")), request.queryParams("first_name"), request.queryParams("last_name"),request.queryParams("city"), request.queryParams("neighborhood"),request.queryParams("street"),request.queryParams("email"));
                        Base.close();
                        return message + "<p><a href='/abmdueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
        
        
        
        
        //------------------------------      ABM Inmueble    ---------------------------- //
        
        Spark.get(new Route("/insertarinmueble/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMBuilding.register();			
	    	}
	});

	Spark.post(new Route ("/insertarinmueble/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        BuildingController.register(request.queryParams("type"),request.queryParams("city"), request.queryParams("neighborhood"),request.queryParams("street"),request.queryParams("price"), request.queryParams("description"), request.queryParams("sale"), request.queryParams("rental"), request.queryParams("owner_id"));
                        Base.close();
                        return "El inmueble ha sido agregado exitosamente" + "<p><a href='/abminmueble/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>" ;
                                	
		}
   	});
    
    
   Spark.get(new Route("/eliminarinmueble/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMBuilding.deRegister();			
	    	}
	});

	Spark.post(new Route ("/eliminarinmueble/"){
	@Override
		public Object handle(Request request, Response response) {
                        response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = BuildingController.deRegister(Integer.parseInt(request.queryParams("id")));
                        Base.close();
                        return message + "<p><a href='/abminmueble/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
    
    Spark.get(new Route("/modificarinmueble/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMBuilding.modify();			
	    	}
	});

	Spark.post(new Route ("/modificarinmueble/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = BuildingController.modify(Integer.parseInt(request.queryParams("building_id")),request.queryParams("type"),request.queryParams("city"), request.queryParams("neighborhood"),request.queryParams("street"),request.queryParams("price"), request.queryParams("description"), request.queryParams("sale"), request.queryParams("rental"), request.queryParams("owner_id"));
                        Base.close();
                        return message + "<p><a href='/abminmueble/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
    
    
        
        
        
        //----------------------------------      ABM Inmobiliaria    ----------------------------// 
        
        Spark.get(new Route("/insertarinmob/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMEstate.register();			
	    	}
	});

	Spark.post(new Route ("/insertarinmob/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        EstateController.register(request.queryParams("name"),request.queryParams("city"), request.queryParams("neighborhood"),request.queryParams("street"),request.queryParams("phone"), request.queryParams("mail"), request.queryParams("web_site"));
                        Base.close();
                        return "La inmobiliaria ha sido agregada exitosamente" + "<p><a href='/abminmobiliaria/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>" ;
                                	
		}
   	});
    
    
   Spark.get(new Route("/eliminarinmob/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMEstate.deRegister();			
	    	}
	});

	Spark.post(new Route ("/eliminarinmob/"){
	@Override
		public Object handle(Request request, Response response) {
                        response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = EstateController.deRegister(Integer.parseInt(request.queryParams("id")));
                        Base.close();
                        return message + "<p><a href='/abminmobiliaria/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
    
    Spark.get(new Route("/modificarinmob/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return ABMEstate.modify();			
	    	}
	});

	Spark.post(new Route ("/modificarinmob/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = EstateController.modify(Integer.parseInt(request.queryParams("Id")),request.queryParams("name"),request.queryParams("city"), request.queryParams("neighborhood"),request.queryParams("street"),request.queryParams("phone"), request.queryParams("mail"), request.queryParams("web_site"));
                        Base.close();
                        return message + "<p><a href='/abminmobiliaria/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
    
        
        
        // ------------------------------------ Search ---------------------------------------//
        
        Spark.get(new Route("/buscarcasa/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return SearchMenu.buscarCasa();			
	    	}
	});

	Spark.post(new Route ("/buscarcasa/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = Search.searchBuilding(request.queryParams("city"), "casa");
                        Base.close();
                        return message + "<p><a href='/buscar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
        
        
        Spark.get(new Route("/buscarcampo/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return SearchMenu.buscarCampo();			
	    	}
	});

	Spark.post(new Route ("/buscarcampo/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = Search.searchBuilding(request.queryParams("city"),"campo");
                        Base.close();
                        return message + "<p><a href='/buscar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
        
        Spark.get(new Route("/buscardepartamento/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return SearchMenu.buscarDepartamento();			
	    	}
	});

	Spark.post(new Route ("/buscardepartamento/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = Search.searchBuilding(request.queryParams("city"), "departamento");
                        Base.close();
                        return message + "<p><a href='/buscar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
        
        
        
        Spark.get(new Route("/buscarinmob/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return SearchMenu.buscarInmob();			
	    	}
	});

	Spark.post(new Route ("/buscarinmob/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = Search.searchEstate(request.queryParams("city"));
                        Base.close();
                        return message + "<p><a href='/buscar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
        
        
        
        Spark.get(new Route("/buscardueno/") {
     	@Override
     		public Object handle(Request request, Response response) {
			response.type("text/html");	     					
			return SearchMenu.buscarDueno();			
	    	}
	});

	Spark.post(new Route ("/buscardueno/"){
	@Override
		public Object handle(Request request, Response response) {
			response.type("text/html");	
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = Search.searchOwner(request.queryParams("city"));
                        Base.close();
                        return message + "<p><a href='/buscar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
    
    
    
        
        
        // ------------------------------------------------Listar tablas ---------------------------------------//
        
         
        Spark.get(new Route ("/listarinmueble/"){
	@Override
		public Object handle(Request request, Response response) {
				
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = ListarTablas.listarInmuebles();
                        Base.close();
                        
           
                        return message + "<p><a href='/listar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
        
        Spark.get(new Route ("/listardueno/"){
	@Override
		public Object handle(Request request, Response response) {
				
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = ListarTablas.listarDuenos();
                        Base.close();
                        
           
                        return message + "<p><a href='/listar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
        
        
        
        
         Spark.get(new Route ("/listarinmob/"){
	@Override
		public Object handle(Request request, Response response) {
				
			Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
                        String message = ListarTablas.listarInmobiliaria();
                        Base.close();
                        
           
                        return message + "<p><a href='/listar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";	
		}
   	});
    
    }  
    
      
}
