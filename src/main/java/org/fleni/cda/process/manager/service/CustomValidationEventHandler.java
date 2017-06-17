package org.fleni.cda.process.manager.service;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

public class CustomValidationEventHandler implements ValidationEventHandler{

    public boolean handleEvent(ValidationEvent evt) {
        System.out.println("Event Info: "+evt);
        if(evt.getMessage().contains("Unexpected element"))
            return true;
        return false;
    }
}
