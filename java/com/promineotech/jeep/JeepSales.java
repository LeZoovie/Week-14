package com.promineotech.jeep;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class JeepSales {
  
  public static void main (String[] args) {
    SpringApplication.run(JeepSales.class, args); 
    // Boots Spring Application and examines the jeep sales class. -> Then finds the Spring annotation & starts its,
    // auto configuration Process & then the component scan loads all the classes.
      
  }
}
