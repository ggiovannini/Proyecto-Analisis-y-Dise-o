package com.unrc.app.models;

import org.javalite.activejdbc.Model;

public class Building extends Model {
    static{
      validatePresenceOf("type", "city", "neighborhood", "street");
  }
    
}

