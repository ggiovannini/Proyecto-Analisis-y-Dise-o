package html;




public class ABMEstate {
    
    public static String register () {
        return          "" + 
			"<form method = 'POST' action='/insertarinmob/'  >"+
     			"Nombre: <input name='name'><P>"+     			
                        "Ciudad : <input name='city'><P>"+                       
                        "Barrio: <input name='neighborhood'><P>"+       
                        "Calle: <input name='street'><P>"+
                        "Telefono: "+"<input name='phone'><P>"+
                        "Email: "+"<input name='email'><P>"+ 
                        "Sitio web "+"<input name='web_site'><P>"+
     			"<input type='submit' value='Insertar'>";
     						
	    	}
 public static String deRegister () {
        return          "" + 
			"<form method = 'POST' action='/eliminarinmob/'  >"+
     			"id: <input name='id'><P>"+                               
     			"<input type='submit' value='Eliminar'>";
                        
	    	}
 
 public static String modify () {
        return          "" + 
			"<form method = 'POST' action='/modificarinmob/'  >"+
                        "Id: <input name='Id'><P>"+  
     			"Nombre: <input name='name'><P>"+     			
                        "Ciudad : <input name='city'><P>"+                       
                        "Barrio: <input name='neighborhood'><P>"+       
                        "Calle: <input name='street'><P>"+
                        "Telefono: "+"<input name='phone'><P>"+
                        "Email: "+"<input name='mail'><P>"+ 
                        "Sitio web "+"<input name='web_site'><P>"+
     			"<input type='submit' value='Modificar'>";
     						
	    	}
}
