package com.unrc.app.models;

import org.javalite.activejdbc.Model;

//Como la relacion entre duenos e inmobiliarias es de N a N, activeJdbc la modela con una tercera tabla
//que contiene los respectivos id de cada participante de la relacion
//para eso esta clase, y el nombre es asi a proposito, para que despues se haga el mapeo correcto con la
//tabla de SQL, la cual se llama, como veras si entras, estates_owners
public class EstatesOwners extends Model {
    
}
