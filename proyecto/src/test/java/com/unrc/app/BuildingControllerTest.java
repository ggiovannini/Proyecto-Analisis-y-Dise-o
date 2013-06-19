package com.unrc.app;

import com.unrc.app.models.*;
import com.unrc.controllers.BuildingController;
import java.util.List;
import org.javalite.activejdbc.Base;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class BuildingControllerTest {

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
        String type = "casa";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String price= "1";
	String description="-";
        String sale ="si";
        String rental="no";
        String owner_id = "2";
	BuildingController.register(type, city,neighborhood,street,price,description,sale,rental, owner_id);

        
        List<Building> lista = Building.where(
                "type = ? and city = ? and neighborhood = ? and street = ? and price = ? and description = ? and sale = ? and rental = ? and owner_id = ?", 
                type, city, neighborhood, street, price, description, sale, rental, owner_id); 
              
        assertEquals(lista.size(),1);
    }
    
      @Test
    public void testEliminar() throws Exception {
        String type = "casa";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String price= "1";
	String description="-";
        String sale ="si";
        String rental="no";
        String owner_id = "2";
	BuildingController.register(type, city,neighborhood,street,price,description,sale,rental, owner_id);

        Building inmueble = Building.findFirst(
                "type = ? and city = ? and neighborhood = ? and street = ? and price = ? and description = ? and sale = ? and rental = ? and owner_id = ?", 
                type, city, neighborhood, street, price, description, sale, rental, owner_id); 
                     
                		
		int id =(Integer)inmueble.getId();
		BuildingController.deRegister(id);
		Building o=Building.findById(id);
		assertTrue(o==null);
	
     
    }
  

    public void testModificar() {

        String type = "casa";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String price= "1";
	String description="-";
        String sale ="si";
        String rental="no";
        String owner_id = "2";
	BuildingController.register(type, city,neighborhood,street,price,description,sale,rental, owner_id);

       
        String new_neighborhood = "centro";
        String new_street = "gwemes";
	String new_price= "2";
        
        Building inmueble = Building.findFirst(
                "type = ? and city = ? and neighborhood = ? and street = ? and price = ? and description = ? and sale = ? and rental = ? and owner_id = ?", 
                type, city, neighborhood, street, price, description, sale, rental, owner_id); 
              
        
        int id =(Integer)inmueble.getId();
	BuildingController.modify(id, type, city, new_neighborhood, new_street, new_price, description, sale, rental, owner_id);
	
        
        Building inmueble2 = Building.findById (id);
        assertEquals(inmueble2.get ("street"),new_street);
        assertEquals(inmueble2.get ("neighborhood"),new_neighborhood);
        assertEquals(inmueble2.get ("price"),new_price);
        
        
       	
   }
     
}
