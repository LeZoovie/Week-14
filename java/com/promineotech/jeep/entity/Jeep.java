package com.promineotech.jeep.entity;

import java.math.BigDecimal; 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



 @Data
 @NoArgsConstructor
 @AllArgsConstructor
  public class Jeep {
    
    private Long modelPK;
    private JeepModel modelId;
    private String trimLevel;
    private int numDoors;
    private int wheelSize;
    private BigDecimal basePrice;
  
  }

