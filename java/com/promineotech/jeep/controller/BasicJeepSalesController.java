package com.promineotech.jeep.controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.service.JeepSalesService;
import lombok.extern.slf4j.Slf4j;

//When an http requests comes in the dispatcher servlet takes control of it & looks at its mapping table to see which class/ function/ method to map to.
// Then calls the method. Once the method is called, then we have control and is given back to Spring once done. 
@RestController
@Slf4j

public class BasicJeepSalesController implements JeepSalesController {
  
  @Autowired
  private JeepSalesService jeepSalesService;

  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    log.info("model={}, trim={}", model, trim);
    return jeepSalesService.fetchJeeps(model, trim);
  }
}
