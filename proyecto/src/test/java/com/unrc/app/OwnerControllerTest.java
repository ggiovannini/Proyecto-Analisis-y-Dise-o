package com.unrc.app;

import com.unrc.app.models.*;
import com.unrc.controllers.OwnerController;
import java.util.List;
import org.javalite.activejdbc.Base;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class OwnerControllerTest {

    @Before
    public void before() {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
        Base.openTransaction();
    }

    @After
    public void after() {
        Base.rollbackTransaction();
        Base.close();
    }

    @Test
    public void testInsertar() {
        String first_name = "jimi";
        String last_name = "hendrix";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String email= "jimi@gmail.com";

	OwnerController.register(first_name, last_name, city,neighborhood,street,email);

        
        List<Owner> lista = Owner.where(
                "first_name = ? and last_name = ? and city = ? and neighborhood = ? and street = ? and email = ?",
                first_name, last_name, city, neighborhood, street, email); 
              
        assertEquals(lista.size(),1);
    }
    
      @Test
    public void testEliminar() throws Exception {
        String first_name = "jimi";
        String last_name = "hendrix";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String email= "jimi@gmail.com";

	OwnerController.register(first_name, last_name, city,neighborhood,street,email);

        Owner dueno = Owner.findFirst(
                "first_name = ? and last_name = ? and city = ? and neighborhood = ? and street = ? and email = ?",
                first_name, last_name, city, neighborhood, street, email); 
                     
                		
		int id =(Integer)dueno.getId();
		OwnerController.deRegister(id);
		Owner o= Owner.findById(id);
		assertTrue(o==null);
	
     
    }
  

    public void testModificar() {

        String first_name = "jimi";
        String last_name = "hendrix";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String email= "jimi@gmail.com";

	OwnerController.register(first_name, last_name, city,neighborhood,street,email);

               
        String new_neighborhood = "centro";
        String new_street = "gwemes";
	String new_last_name ="page";
        
        Owner dueno = Owner.findFirst(
                "first_name = ? and last_name = ? and city = ? and neighborhood = ? and street = ? and email = ?",
                first_name, last_name, city, neighborhood, street, email);
        
        int id =(Integer)dueno.getId();
	OwnerController.modify(id, first_name, new_last_name, city, new_neighborhood, new_street, email);
	
        
        Owner dueno2 = Owner.findById (id);
        assertEquals(dueno2.get ("street"),new_street);
        assertEquals(dueno2.get ("neighboorhood"),new_neighborhood);
        assertEquals(dueno2.get ("last_name"),new_last_name);
        
        
       	
   }
     
}
