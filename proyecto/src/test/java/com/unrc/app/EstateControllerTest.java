package com.unrc.app;

import com.unrc.app.models.*;
import com.unrc.controllers.EstateController;
import java.util.List;
import org.javalite.activejdbc.Base;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class EstateControllerTest {

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
        String name = "inmo";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String phone= "999";
	String mail="inmo@";
        String web_site ="www.inmo.com";
        EstateController.register(name, city,neighborhood,street,phone,mail,web_site);

        
        List<Estate> lista = Estate.where(
                "name = ? and city = ? and neighborhood = ? and street = ? and phone = ? and mail = ? and web_site = ?", 
                name, city, neighborhood, street, phone, mail, web_site); 
              
        assertEquals(lista.size(),1);
    }
    
      @Test
    public void testEliminar() throws Exception {
        String name = "inmo";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String phone= "999";
	String mail="inmo@";
        String web_site ="www.inmo.com";
        EstateController.register(name, city,neighborhood,street,phone,mail,web_site);

        Estate inmo = Estate.findFirst(
                "name = ? and city = ? and neighborhood = ? and street = ? and phone = ? and mail = ? and web_site = ?", 
                name, city, neighborhood, street, phone, mail, web_site); 
                               		
                int id =(Integer)inmo.getId();
		EstateController.deRegister(id);
		Estate o = Estate.findById(id);
		assertTrue(o==null);
	
     
    }
  

    public void testModificar() {

        String name = "inmo";
        String city = "moldes";
        String neighborhood = "diagonal";
        String street = "argerich";
	String phone= "999";
	String mail="inmo@";
        String web_site ="www.inmo.com";
        EstateController.register(name, city,neighborhood,street,phone,mail,web_site);

        Estate inmo = Estate.findFirst(
                "name = ? and city = ? and neighborhood = ? and street = ? and phone = ? and mail = ? and web_site = ?", 
                name, city, neighborhood, street, phone, mail, web_site); 
        
       
        String new_neighborhood = "centro";
        String new_street = "gwemes";
	String new_name= "mobiliario";
        
        
              
        
        int id =(Integer)inmo.getId();
	EstateController.modify(id, new_name, city, new_neighborhood, new_street, phone, mail, web_site);
	
        
        Estate inmo2 = Estate.findById (id);
        assertEquals(inmo2.get ("street"),new_street);
        assertEquals(inmo2.get ("neighborhood"),new_neighborhood);
        assertEquals(inmo2.get ("name"),new_name);
        
        
       	
   }
     
}
