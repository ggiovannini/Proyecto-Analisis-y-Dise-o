package html;


public class ABMOwner {
    
    public static String register () {
        return          "" + 
			"<form method = 'POST' action='/insertardueno/'  >"+
     			"Nombre: <input name='first_name'><P>"+
     			"Apellido: <input name='last_name'><P>"+
                        "Ciudad : <input name='city'><P>"+                       
                        "Barrio: <input name='neighborhood'><P>"+       
                        "Calle: <input name='street'><P>"+
                        "Email: "+"<input name='email'><P>"+                                
     			"<input type='submit' value='Insertar'>";
     						
	    	}
 public static String deRegister () {
        return          "" + 
			"<form method = 'POST' action='/eliminardueno/'  >"+
     			"id: <input name='owner_id'><P>"+                               
     			"<input type='submit' value='Eliminar'>";
                        
	    	}
 
 public static String modify () {
        return          "" + 
			"<form method = 'POST' action='/modificardueno/'  >"+
                        "Id: <input name='owner_id'><P>"+
     			"Nombre: <input name='first_name'><P>"+
     			"Apellido: <input name='last_name'><P>"+
                        "Ciudad : <input name='city'><P>"+                       
                        "Barrio: <input name='neighborhood'><P>"+       
                        "Calle: <input name='street'><P>"+
                        "Email: "+"<input name='email'><P>"+                                
     			"<input type='submit' value='Modificar'>";
     						
	    	}
}
