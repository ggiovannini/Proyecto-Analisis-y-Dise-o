package html;

public class Menu {
    public static String menuPrinc () {
        String a =  "<html>"+ 
                    "<head>"+ 
                    "<title>Proyecto Analisis 2013</title>"+ 
                    "</head>"+ 
                    "<body>"+
                        "<p><h1>---- Menu ----</h1></p>"+
                        
                        "<p><a href='/abminmueble/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='ABM Inmueble' />"+
                        "</form></a></p>"+
                        
                        "<p><a href='/abminmobiliaria/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='ABM Inmobiliaria' />"+
                        "</form></a></p>"+
                        
                        "<p><a href='/abmdueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='ABM Dueno' />"+
                        "</form></a></p>"+
                            
                        "<p><a href='/buscar/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Buscar' />"+
                        "</form></a></p>"+

                       "</body>"+
                        "</html>";
        
        
                
 
 
        return a;
      
    }
    
    public static String menuAbmInmueble () {
        String a =  "<html>"+ 
                    "<head>"+ 
                    "<title>Proyecto Analisis 2013</title>"+ 
                    "</head>"+ 
                    "<body>"+
                        "<p><h1>---- ABM Inmueble ----</h1></p>"+
                
                        "<p><a href='/insertarinmueble/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Insertar inmueble' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/eliminartarinmueble/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Eliminar inmueble' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/modificarinmueble/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Modificar inmueble' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/menu/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>"+
                
                        
                    "</body>"+
                    "</html>";
        return a;
        
    }
    
    public static String menuAbmInmobiliaria () {
        String a =  "<html>"+ 
                    "<head>"+ 
                    "<title>Proyecto Analisis 2013</title>"+ 
                    "</head>"+ 
                    "<body>"+
                        "<p><h1>---- ABM Inmobiliaria ----</h1></p>"+
                
                        "<p><a href='/insertarinmob/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Insertar inmobiliaria' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/eliminarinmob/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Eliminar inmobiliaria' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/modificarinmob/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Modificar inmobiliaria' />"+
                        "</form></a></p>"+
                
                        
                        "<p><a href='/menu/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>"+
                    "</body>"+
                    "</html>";
        return a;
        
    }
    
    public static String menuAbmDueno () {
        String a =  "<html>"+ 
                    "<head>"+ 
                    "<title>Proyecto Analisis 2013</title>"+ 
                    "</head>"+ 
                    "<body>"+
                        "<p><h1>---- ABM Dueño ----</h1></p>"+
                
                        "<p><a href='/insertardueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Insertar dueno' />"+
                        "</form></a></p>"+
                        
                        "<p><a href='/eliminardueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Eliminar dueno' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/modificardueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='MOdificar dueno' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/menu/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>"+
                    "</body>"+
                    "</html>";
        return a;
        
    }
    
    public static String menuBuscar () {
        String a =  "<html>"+ 
                    "<head>"+ 
                    "<title>Proyecto Analisis 2013</title>"+ 
                    "</head>"+ 
                    "<body>"+
                        "<p><h1>---- Buscar ----</h1></p>"+
                        
                        "<p><a href='/buscarcasa/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Buscar casa' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/buscarcampo/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Buscar campo' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/buscardepartamento/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Buscar departamento' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/buscardueno/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Buscar dueno' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/buscarinmob/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Buscar inmobiliaria' />"+
                        "</form></a></p>"+
                
                        "<p><a href='/menu/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>"+
                    "</body>"+
                    "</html>";
        return a;
        
    }

}

