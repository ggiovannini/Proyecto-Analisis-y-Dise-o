package html;


public class SearchMenu {
    
    public static String buscarCasa () {
        return          "" + 
			"<form method = 'POST' action='/buscarcasa/'  >"+
     			"Ciudad: <input name='city'><P>"+
     			"<input type='submit' value='Buscar'>";
     						
	    	}
    
    public static String buscarCampo () {
        return          "" + 
			"<form method = 'POST' action='/buscarcampo/'  >"+
     			"Ciudad: <input name='city'><P>"+
     			"<input type='submit' value='Buscar'>";
     						
	    	}

    public static String buscarDepartamento () {
        return          "" + 
			"<form method = 'POST' action='/buscardepartamento/'  >"+
     			"Ciudad: <input name='city'><P>"+
     			"<input type='submit' value='Buscar'>";
     						
	    	}
        public static String buscarInmob () {
        return          "" + 
			"<form method = 'POST' action='/buscarinmob/'  >"+
     			"Ciudad: <input name='city'><P>"+
     			"<input type='submit' value='Buscar'>";
     						
	    	}
        
            public static String buscarDueno () {
        return          "" + 
			"<form method = 'POST' action='/buscardueno/'  >"+
     			"Ciudad: <input name='city'><P>"+
     			"<input type='submit' value='Buscar'>";
     						
	    	}



}
