package com.unrc.app.models;

import org.javalite.activejdbc.Model;

//Como la relacion entre due�os e inmobiliarias es de N a N, activeJdbc la modela con una tercera tabla
//que contiene los respectivos ids de cada participante de la relacion
//para eso esta clase, y el nombre es as� a prop�sito, para que despu�s se haga el mapeo correcto con la
//tabla de SQL, la cual se llama, como ver�s si entr�s, estates_owners
public class EstatesOwners extends Model {
    
}
