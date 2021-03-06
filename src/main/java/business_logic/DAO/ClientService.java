/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic.DAO;

import business_logic.DAO.interfaces.ClientInterface;
import business_logic.entity.Client;
import business_logic.entity.CreditCards;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author student
 */
@Service("jpaClientService")
@Repository
@Transactional
public class ClientService implements ClientInterface {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public Client getClientByEmail(String email) {
        List<Client> resultList = em.createNamedQuery("Client.findByEmail", Client.class)
                .setParameter("email", email)
                .getResultList();
        return resultList.size() > 0 ? resultList.get(0) : null;
    }

    /**
     * @param client_id
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<CreditCards> getAllCardsByClientID(int client_id) {
        Client find = em.find(Client.class, client_id);
        return find.getCreditCardsList();
    }

}
