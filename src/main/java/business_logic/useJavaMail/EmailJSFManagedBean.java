/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_logic.useJavaMail;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

/**
 *
 * @author Evgenii_Lartcev
 * 
 * In this code, @ManagedBean is a declaration that registers the
 * backing bean as a resource with the JSF implementation. In
 * addition, @RequestScoped is the annotation that identiies 
 * the managed bean as a resource that exists only in the scope of
 * the request. In other words, the bean exists for the duration
 * of a single HTTP request for the user’s interaction with the
 * web application.
 */
@ManagedBean
@RequestScoped
public class EmailJSFManagedBean {
    private String to;
    /** Create a new instance of emailJSFManagedBean */
    public EmailJSFManagedBean() {
        to = null;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    
    /**
     * Validate all emails submitted by the user in the web application
     * 
     * @param context
     * @param toValidate
     * @param value 
     */
    public void validateEmail(FacesContext context, UIComponent toValidate, Object value) {
        String message = "";
        String email = (String) value;
        if(email == null || email.equals("")) {
            ((UIInput)toValidate).setValid(false);
            message = "E-mail address is required";
            context.addMessage(
            toValidate.getClientId(context),
            new FacesMessage(message));
        } else if (!(email.contains("@") && email.contains("."))) {
            ((UIInput)toValidate).setValid(false);
            message = "E-mail address is invalid";
            context.addMessage(
            toValidate.getClientId(context),
            new FacesMessage(message));
        }
    }
    
}
