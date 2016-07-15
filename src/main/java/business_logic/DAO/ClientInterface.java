/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic.DAO;

import business_logic.entity.Client;

/**
 *
 * @author student
 */
public interface ClientInterface {
    Client getClientByEmail(String email);
}
