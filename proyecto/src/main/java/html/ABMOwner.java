package html;

import com.unrc.controllers.OwnerController;
import org.javalite.activejdbc.Base;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;


public class ABMOwner {
    public static String register () {
        return          "" + 
			"<form method = 'POST' action='/insertardueno/'  >"+
     			"First Name: <input name='first_name'><P>"+
     			"Last Name: <input name='last_name'><P>"+
                        "City : <input name='city'><P>"+                       
                        "Neighborhood: <input name='neighborhood'><P>"+       
                        "Street: <input name='street'><P>"+
                        "Email: "+"<input name='email'VALUE='example@example.com'><P>"+                                
     			"<input type='submit' value='Add'>"+
     			"<input type='reset' value='Reset'></form>";			
	    	}
}
