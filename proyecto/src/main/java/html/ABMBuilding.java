package html;


public class ABMBuilding {
    
    public static String register () {
        return          "" + 
			"<form method = 'POST' action='/insertarinmueble/'  >"+
     			"Tipo: <input name='type'><P>"+
     			"Ciudad: <input name='city'><P>"+
                        "Barrio  : <input name='neighborhood'><P>"+                       
                        "Calle: <input name='street'><P>"+
                        "Precio: "+"<input name='price'><P>"+
                        "Descripcion: "+"<input name='description'><P>"+
     			"Venta: "+"<input name='sale'><P>"+
                        "Alquiler: "+"<input name='rental'><P>"+
                        "Id Dueno: "+"<input name='owner_id'><P>"+
                        "<input type='submit' value='Insertar'>"+
     			"<p><a href='/menu/'"+                        
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";			
	    	}
    
 public static String deRegister () {
        return          "" + 
			"<form method = 'POST' action='/eliminarinmueble/  >"+
     			"id: <input name='owner_id'><P>"+                               
     			"<input type='submit' value='Eliminar'>"+
                        "<p><a href='/menu/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";
	    	}
 
 public static String modify () {
        return          "" + 
			"<form method = 'POST' action='/modificarinmueble/'  >"+
                        "Id: <input name='building_id'><P>"+  
     			"Tipo: <input name='type'><P>"+
     			"Ciudad: <input name='city'><P>"+
                        "Barrio  : <input name='neighborhood'><P>"+                       
                        "Calle: <input name='street'><P>"+
                        "Precio: "+"<input name='price'><P>"+
                        "Descripcion: "+"<input name='description'><P>"+
     			"Venta: "+"<input name='sale'><P>"+
                        "Alquiler: "+"<input name='rental'><P>"+
                        "Id dueño: "+"<input name='owner_id'><P>"+
                        "<input type='submit' value='Modificar'>"+
     			"<p><a href='/menu/'"+
                        "<form method='post' action='agente.php'>"+
                        "<input type='submit' value='Volver' />"+
                        "</form></a></p>";			
	    	}


}
