/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic.DAO;

import business_logic.entity.Client;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
@Service("jpaClientService")
@Repository
@Transactional
public class ClientService implements ClientInterface{

    @PersistenceContext
    private EntityManager em;
    
    @Transactional(readOnly = true)
    @Override
    public Client getClientByEmail(String email) {
        List<Client> resultList = em.createNamedQuery("Client.findByEmail")
                .setParameter("email", email)
                .getResultList();
        if (resultList.size()>0) {
            return resultList.get(0);
        } else {
            return null;  
        }    
    }
    
}
