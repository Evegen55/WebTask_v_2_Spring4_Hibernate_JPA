/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic.controllers;

import business_logic.DAO.ClientService;
import business_logic.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author john
 */
@Controller
public class DefaultController {

    @Autowired
    public DefaultController defaultController;
    
    @Autowired
    private ApplicationContext appContext;
    
   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public String index(ModelMap map) {
       map.put("msg", "Hello Spring 4 Web MVC!");
       
       
       //===========================
       String email = "Lew@gmail.com";
       ClientService clientService = appContext.getBean(
            "jpaClientService", ClientService.class);
       System.out.println("Find by email: " + clientService.getClientByEmail(email));
       //===========================
       
       return "index";
   }
   
}