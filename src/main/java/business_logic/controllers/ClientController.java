/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic.controllers;

import business_logic.DAO.ClientService;
import business_logic.entity.Client;
import business_logic.entity.CreditCards;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author student
 */
@Controller
public class ClientController {
    
    @Autowired
    public ClientController clientController;
    
    @Autowired
    private ApplicationContext appContext;
    
    @RequestMapping(value = "/my cards", method = RequestMethod.GET)
    public String my_cards(ModelMap map) {
       
       String email = "Lew@gmail.com"; //TODO get this from security context!
       
       ClientService clientService = appContext.getBean("jpaClientService", ClientService.class);
       Client client = clientService.getClientByEmail(email);
       List<CreditCards> list = clientService.getAllCardsByClientID(client.getClientID());
       map.put("msg1", list);
       
       return "my cards";
   }
}
