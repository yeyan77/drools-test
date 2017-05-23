package com.crystal.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by hp on 2017-05-23.
 */
public class main {
    public static void main(String[] args){
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");

        Message message = new Message();
        message.setNote("Hello World");
        message.setStatus(Message.GOODBYE);

        kieSession.insert(message);
        kieSession.fireAllRules();
    }
}
