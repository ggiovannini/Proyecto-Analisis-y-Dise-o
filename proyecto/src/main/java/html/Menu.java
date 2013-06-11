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
                        "<a href='/insertarinmueble/'<p>1: Insertar inmueble</p></a>"+
                        "<a href='/eliminarinmueble/'<p>2: Eliminar inmueble</p></a>"+
                        "<a href='/modificarinmueble/'<p>3: Modificar inmueble</p></a>"+
                        "<a href='/menu/'<p>4: Menu principal</p></a>"+
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
                        "<a href='/insertarinmob/'<p>1: Insertar inmobiliaria</p></a>"+
                        "<a href='/eliminarinmob/'<p>2: Eliminar inmobiliaria</p></a>"+
                        "<a href='/modificarinmob/'<p>3: Modificar inmobiliaria</p></a>"+
                        "<a href='/menu/'<p>4: Menu principal</p></a>"+
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
                        "<a href='/insertardueno/'<p>1: Insertar dueno</p></a>"+
                        "<a href='/eliminardueno/'<p>2: Eliminar dueno</p></a>"+
                        "<a href='/modificardueno/'<p>3: Modificar dueno</p></a>"+
                        "<a href='/menu/'<p>4: Menu principal</p></a>"+
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
                        "<a href=/'buscarcasa/'<p>1: Buscar casa</p></a>"+
                        "<a href='/buscarcampo/'<p>2: Buscar campo </p></a>"+
                        "<a href='/buscardepartamento/'<p>3: Buscar departamento</p></a>"+
                        "<a href='/buscardueno/'<p>4: Buscar dueno</p></a>"+
                        "<a href='/buscarinmob/'<p>5: Buscar inmobiliaria</p></a>"+
                        "<a href='/menu/'<p>6: Menu principal</p></a>"+
                    "</body>"+
                    "</html>";
        return a;
        
    }

}
