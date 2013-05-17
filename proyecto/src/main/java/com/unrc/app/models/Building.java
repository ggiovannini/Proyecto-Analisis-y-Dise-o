package com.unrc.app.models;

import org.javalite.activejdbc.Model;

//la clase Building, para los inmuebles

//como vas a ver en SQL, como es una relacinn de 1 a N, la tabla buildings tiene el id del dueno, ya que asi
//se modela con actijdbc... vas a encontrar una columna que se llama owner_id

public class Building extends Model {
    static{
      validatePresenceOf("type", "city", "neighborhood", "street");
  }
    
}

/* Es una convencion que los nombres de las clases esten en ingles y las tablas tambien, pero es necesaria,
 ya que avtivejdbc asugna las tablas por mapeo sintactico, si entendi bien, entonces:
 
 si la clase es Owner, enteonces la tabla se tiene que llamar owners (en minusculas y plural)
 si la clase es Estate, la tabla es estates
 
 para la relacion N a N, en este caso entre inmobiliarias y duenos, es necesaria la convencion que respete
 * yo, la de:
             la relacion es entre estate y owner, entonces la clase se debe llamar EstatesOwners, mientras
             que la tabla se va a llamar estates_owners
             
*/