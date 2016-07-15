/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

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
}
