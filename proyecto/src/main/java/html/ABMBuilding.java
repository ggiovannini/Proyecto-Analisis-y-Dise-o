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
                        "<input type='submit' value='Insertar'>";
     						
	    	}
    
 public static String deRegister () {
        return          "" + 
			"<form method = 'POST' action='/eliminarinmueble/ ' >"+
     			"id: <input name='id'><P>"+                               
     			"<input type='submit' value='Eliminar'>";
                       
        
        
        
        
        
        
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
                        "Id dueno: "+"<input name='owner_id'><P>"+
                        "<input type='submit' value='Modificar'>";
     						
	    	}


}
