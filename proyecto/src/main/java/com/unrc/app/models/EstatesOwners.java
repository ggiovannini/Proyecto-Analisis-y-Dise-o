package com.unrc.app.models;

import org.javalite.activejdbc.Model;

//Como la relacion entre dueños e inmobiliarias es de N a N, activeJdbc la modela con una tercera tabla
//que contiene los respectivos ids de cada participante de la relacion
//para eso esta clase, y el nombre es así a propósito, para que después se haga el mapeo correcto con la
//tabla de SQL, la cual se llama, como verás si entrás, estates_owners
public class EstatesOwners extends Model {
    
}
