package html;




public class ABMEstate {
    
    public static String register () {
        return          "" + 
			"<form method = 'POST' action='/insertarinmob/'  >"+
     			"Nombre: <input name='first_name'><P>"+     			
                        "Ciudad : <input name='city'><P>"+                       
                        "Barrio: <input name='neighborhood'><P>"+       
                        "Calle: <input name='street'><P>"+
                        "Telefono: "+"<input name='phone'><P>"+
                        "Email: "+"<input name='email'><P>"+ 
                        "Sitio web "+"<input name='web_site'><P>"+
     			"<input type='submit' value='Add'>"+
     			"<input type='reset' value='Reset'></form>";			
	    	}
 public static String deRegister () {
        return          "" + 
			"<form method = 'POST' action='/eliminarinmob/'  >"+
     			"id: <input name='owner_id'><P>"+                               
     			"<input type='submit' value='Remove'>";			
	    	}
 
 public static String modify () {
        return          "" + 
			"<form method = 'POST' action='/modificarinmob/'  >"+
                        "Id: <input name='id'><P>"+  
     			"Nombre: <input name='first_name'><P>"+     			
                        "Ciudad : <input name='city'><P>"+                       
                        "Barrio: <input name='neighborhood'><P>"+       
                        "Calle: <input name='street'><P>"+
                        "Telefono: "+"<input name='phone'><P>"+
                        "Email: "+"<input name='email'><P>"+ 
                        "Sitio web "+"<input name='web_site'><P>"+
     			"<input type='submit' value='Add'>"+
     			"<input type='reset' value='Reset'></form>";			
	    	}
}
